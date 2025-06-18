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

public val FluentUi.Filled.TagOff: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TagOff",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16f, 17.06f)
            lineTo(20.72f, 21.78f)
            curveTo(21.013f, 22.073f, 21.487f, 22.073f, 21.78f, 21.78f)
            curveTo(22.073f, 21.487f, 22.073f, 21.013f, 21.78f, 20.72f)
            lineTo(3.28f, 2.22f)
            curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
            curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
            lineTo(6.942f, 8.003f)
            lineTo(3.486f, 11.463f)
            curveTo(2.218f, 12.733f, 2.22f, 14.791f, 3.49f, 16.059f)
            lineTo(7.952f, 20.514f)
            curveTo(9.223f, 21.781f, 11.279f, 21.78f, 12.548f, 20.513f)
            lineTo(16f, 17.06f)
            close()
            moveTo(21.049f, 12.01f)
            lineTo(18.06f, 15f)
            lineTo(9.002f, 5.941f)
            lineTo(11.986f, 2.953f)
            curveTo(12.596f, 2.343f, 13.423f, 2f, 14.285f, 2f)
            horizontalLineTo(19.751f)
            curveTo(20.993f, 2f, 22.001f, 3.007f, 22.001f, 4.25f)
            verticalLineTo(9.712f)
            curveTo(22.001f, 10.574f, 21.659f, 11.4f, 21.049f, 12.01f)
            close()
            moveTo(17.001f, 5.502f)
            curveTo(16.172f, 5.502f, 15.501f, 6.174f, 15.501f, 7.002f)
            curveTo(15.501f, 7.831f, 16.172f, 8.502f, 17.001f, 8.502f)
            curveTo(17.829f, 8.502f, 18.501f, 7.831f, 18.501f, 7.002f)
            curveTo(18.501f, 6.174f, 17.829f, 5.502f, 17.001f, 5.502f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TagOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TagOff, contentDescription = null)
    }
}
