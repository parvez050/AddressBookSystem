package AddressBookProblem;

import java.util.List;

public class AddressBookServiceMain
{
    private List<AddressBookData> addressBookList;
    public enum IOService {DB_IO}
    private static AddressBookDatabaseService addressBookDBService;

    public AddressBookServiceMain()
    {
        addressBookDBService = AddressBookDatabaseService.getInstance();
    }

    public List<AddressBookData> readAddressBookData(IOService ioService)
    {
        if (ioService.equals(IOService.DB_IO))
        {
            this.addressBookList = addressBookDBService.readDate();
        }
        return addressBookList;
    }
}
