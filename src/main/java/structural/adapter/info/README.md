# Adaptor

## Implementations

- Class Adapter – uses inheritance and extends
  the source interface, in my case FishingBoatAdaptor class.
- Object Adapter – uses composition and adapter contains the source object.

## Info

- Convert the interface of a class into another interface the clients expect.
- Helps classes work together that couldn't otherwise because of incompatible interfaces.

## Usage

- Arrays.asList()
- java.io.InputStreamReader(InputStream) (returns a Reader)
- java.io.OutputStreamWriter(OutputStream) (returns a Writer)