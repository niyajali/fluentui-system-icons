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

public val FluentUi.Filled.ClipboardSearch: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ClipboardSearch",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.75f, 2f)
            horizontalLineTo(10.25f)
            curveTo(9.092f, 2f, 8.138f, 2.875f, 8.014f, 3.999f)
            lineTo(6.25f, 4f)
            curveTo(5.007f, 4f, 4f, 5.007f, 4f, 6.25f)
            verticalLineTo(10.1f)
            curveTo(4.75f, 9.716f, 5.6f, 9.5f, 6.5f, 9.5f)
            curveTo(9.538f, 9.5f, 12f, 11.962f, 12f, 15f)
            curveTo(12f, 16.011f, 11.726f, 16.96f, 11.25f, 17.775f)
            lineTo(13.487f, 20.013f)
            curveTo(14.025f, 20.55f, 14.14f, 21.35f, 13.832f, 22f)
            horizontalLineTo(17.75f)
            curveTo(18.993f, 22f, 20f, 20.993f, 20f, 19.75f)
            verticalLineTo(6.25f)
            curveTo(20f, 5.007f, 18.993f, 4f, 17.75f, 4f)
            lineTo(15.986f, 3.999f)
            curveTo(15.862f, 2.875f, 14.908f, 2f, 13.75f, 2f)
            close()
            moveTo(10.25f, 3.5f)
            horizontalLineTo(13.75f)
            curveTo(14.164f, 3.5f, 14.5f, 3.836f, 14.5f, 4.25f)
            curveTo(14.5f, 4.664f, 14.164f, 5f, 13.75f, 5f)
            horizontalLineTo(10.25f)
            curveTo(9.836f, 5f, 9.5f, 4.664f, 9.5f, 4.25f)
            curveTo(9.5f, 3.836f, 9.836f, 3.5f, 10.25f, 3.5f)
            close()
            moveTo(9.95f, 17.889f)
            curveTo(10.605f, 17.108f, 11f, 16.1f, 11f, 15f)
            curveTo(11f, 12.515f, 8.985f, 10.5f, 6.5f, 10.5f)
            curveTo(4.015f, 10.5f, 2f, 12.515f, 2f, 15f)
            curveTo(2f, 17.485f, 4.015f, 19.5f, 6.5f, 19.5f)
            curveTo(7.342f, 19.5f, 8.131f, 19.268f, 8.805f, 18.866f)
            lineTo(11.72f, 21.78f)
            curveTo(12.013f, 22.073f, 12.487f, 22.073f, 12.78f, 21.78f)
            curveTo(13.073f, 21.487f, 13.073f, 21.013f, 12.78f, 20.72f)
            lineTo(9.95f, 17.889f)
            close()
            moveTo(6.5f, 18f)
            curveTo(4.843f, 18f, 3.5f, 16.657f, 3.5f, 15f)
            curveTo(3.5f, 13.343f, 4.843f, 12f, 6.5f, 12f)
            curveTo(8.157f, 12f, 9.5f, 13.343f, 9.5f, 15f)
            curveTo(9.5f, 16.657f, 8.157f, 18f, 6.5f, 18f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ClipboardSearchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ClipboardSearch, contentDescription = null)
    }
}
