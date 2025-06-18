package fluent.ui.system.icons.regular

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.ChatAdd: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ChatAdd",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.75f, 7.75f)
            curveTo(12.75f, 7.336f, 12.414f, 7f, 12f, 7f)
            curveTo(11.586f, 7f, 11.25f, 7.336f, 11.25f, 7.75f)
            verticalLineTo(11.25f)
            horizontalLineTo(7.75f)
            curveTo(7.336f, 11.25f, 7f, 11.586f, 7f, 12f)
            curveTo(7f, 12.414f, 7.336f, 12.75f, 7.75f, 12.75f)
            horizontalLineTo(11.25f)
            verticalLineTo(16.25f)
            curveTo(11.25f, 16.664f, 11.586f, 17f, 12f, 17f)
            curveTo(12.414f, 17f, 12.75f, 16.664f, 12.75f, 16.25f)
            verticalLineTo(12.75f)
            horizontalLineTo(16.25f)
            curveTo(16.664f, 12.75f, 17f, 12.414f, 17f, 12f)
            curveTo(17f, 11.586f, 16.664f, 11.25f, 16.25f, 11.25f)
            horizontalLineTo(12.75f)
            verticalLineTo(7.75f)
            close()
            moveTo(22f, 12f)
            curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
            curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
            curveTo(2f, 13.62f, 2.386f, 15.186f, 3.115f, 16.592f)
            lineTo(2.047f, 20.415f)
            curveTo(1.985f, 20.635f, 1.985f, 20.868f, 2.047f, 21.088f)
            curveTo(2.233f, 21.753f, 2.922f, 22.141f, 3.587f, 21.955f)
            lineTo(7.413f, 20.888f)
            curveTo(8.818f, 21.615f, 10.382f, 22f, 12f, 22f)
            curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
            close()
            moveTo(3.5f, 12f)
            curveTo(3.5f, 7.306f, 7.306f, 3.5f, 12f, 3.5f)
            curveTo(16.694f, 3.5f, 20.5f, 7.306f, 20.5f, 12f)
            curveTo(20.5f, 16.694f, 16.694f, 20.5f, 12f, 20.5f)
            curveTo(10.532f, 20.5f, 9.12f, 20.128f, 7.867f, 19.43f)
            lineTo(7.598f, 19.279f)
            lineTo(3.611f, 20.391f)
            lineTo(4.724f, 16.407f)
            lineTo(4.573f, 16.138f)
            curveTo(3.873f, 14.883f, 3.5f, 13.47f, 3.5f, 12f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ChatAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ChatAdd, contentDescription = null)
    }
}
