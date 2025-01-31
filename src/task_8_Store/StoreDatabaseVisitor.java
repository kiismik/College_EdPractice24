package task_8_Store;

class StoreDatabaseVisitor implements StoreAbstractVisitor {
    @Override
    public String visit(Staff staff) {
        return "visit(Staff)";
    }

    @Override
    public String visit(StoreManager manager) {
        return "visit(StoreManager)";
    }

    @Override
    public String visit(ProductCategory category) {
        return "visit(ProductCategory)";
    }

    @Override
    public String visitElectronicProduct(ElectronicProduct product) {
        String out = "Product Name: " + product.name + "\n";
        out += "Manager: visit(product.manager) \n";
        out += "Price: " + product.getPrice() + "\n";
        out += "Is under warranty: " + product.isWarranty();
        return out;
    }

    @Override
    public String visitInternalTool(InternalTool tool) {
        return "visit(InternalTool)";
    }
}
