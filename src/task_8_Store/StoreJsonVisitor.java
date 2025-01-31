package task_8_Store;

class StoreJsonVisitor implements StoreAbstractVisitor {
    @Override
    public String visit(Staff staff) {
        return null;
    }

    @Override
    public String visit(StoreManager manager) {
        return null;
    }

    @Override
    public String visit(ProductCategory category) {
        return null;
    }

    @Override
    public String visitElectronicProduct(ElectronicProduct product) {
        return null;
    }

    @Override
    public String visitInternalTool(InternalTool tool) {
        return null;
    }
}
