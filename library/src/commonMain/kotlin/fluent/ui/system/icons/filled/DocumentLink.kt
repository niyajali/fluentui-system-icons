package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Filled.DocumentLink: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentLink",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 2f)
            verticalLineTo(8f)
            curveTo(12f, 9.105f, 12.895f, 10f, 14f, 10f)
            horizontalLineTo(20f)
            verticalLineTo(20f)
            curveTo(20f, 21.105f, 19.105f, 22f, 18f, 22f)
            horizontalLineTo(13f)
            curveTo(13.628f, 21.164f, 14f, 20.126f, 14f, 19f)
            curveTo(14f, 16.239f, 11.761f, 14f, 9f, 14f)
            horizontalLineTo(4f)
            verticalLineTo(4f)
            curveTo(4f, 2.895f, 4.895f, 2f, 6f, 2f)
            horizontalLineTo(12f)
            close()
            moveTo(13.5f, 2.5f)
            verticalLineTo(8f)
            curveTo(13.5f, 8.276f, 13.724f, 8.5f, 14f, 8.5f)
            horizontalLineTo(19.5f)
            lineTo(13.5f, 2.5f)
            close()
            moveTo(5.75f, 15.75f)
            curveTo(5.75f, 15.336f, 5.414f, 15f, 5f, 15f)
            lineTo(4.8f, 15.005f)
            curveTo(2.684f, 15.109f, 1f, 16.858f, 1f, 19f)
            curveTo(1f, 21.209f, 2.791f, 23f, 5f, 23f)
            lineTo(5.102f, 22.993f)
            curveTo(5.468f, 22.944f, 5.75f, 22.63f, 5.75f, 22.25f)
            curveTo(5.75f, 21.836f, 5.414f, 21.5f, 5f, 21.5f)
            lineTo(4.836f, 21.495f)
            curveTo(3.532f, 21.41f, 2.5f, 20.326f, 2.5f, 19f)
            curveTo(2.5f, 17.619f, 3.619f, 16.5f, 5f, 16.5f)
            lineTo(5.102f, 16.493f)
            curveTo(5.468f, 16.444f, 5.75f, 16.13f, 5.75f, 15.75f)
            close()
            moveTo(13f, 19f)
            curveTo(13f, 16.791f, 11.209f, 15f, 9f, 15f)
            lineTo(8.898f, 15.007f)
            curveTo(8.532f, 15.057f, 8.25f, 15.37f, 8.25f, 15.75f)
            curveTo(8.25f, 16.164f, 8.586f, 16.5f, 9f, 16.5f)
            lineTo(9.164f, 16.505f)
            curveTo(10.469f, 16.59f, 11.5f, 17.674f, 11.5f, 19f)
            curveTo(11.5f, 20.381f, 10.381f, 21.5f, 9f, 21.5f)
            lineTo(8.898f, 21.507f)
            curveTo(8.532f, 21.556f, 8.25f, 21.87f, 8.25f, 22.25f)
            curveTo(8.25f, 22.664f, 8.586f, 23f, 9f, 23f)
            lineTo(9.2f, 22.995f)
            curveTo(11.316f, 22.891f, 13f, 21.142f, 13f, 19f)
            close()
            moveTo(8.75f, 18.25f)
            horizontalLineTo(5.25f)
            lineTo(5.148f, 18.257f)
            curveTo(4.782f, 18.306f, 4.5f, 18.62f, 4.5f, 19f)
            curveTo(4.5f, 19.414f, 4.836f, 19.75f, 5.25f, 19.75f)
            horizontalLineTo(8.75f)
            lineTo(8.852f, 19.743f)
            curveTo(9.218f, 19.694f, 9.5f, 19.38f, 9.5f, 19f)
            curveTo(9.5f, 18.586f, 9.164f, 18.25f, 8.75f, 18.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentLinkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DocumentLink, contentDescription = null)
    }
}
