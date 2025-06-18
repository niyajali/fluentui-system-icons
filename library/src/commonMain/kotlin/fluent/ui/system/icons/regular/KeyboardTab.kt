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

public val FluentUi.Regular.KeyboardTab: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.KeyboardTab",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(18.03f, 11.47f)
            lineTo(11.53f, 4.97f)
            curveTo(11.237f, 4.677f, 10.763f, 4.677f, 10.47f, 4.97f)
            curveTo(10.203f, 5.236f, 10.179f, 5.653f, 10.397f, 5.946f)
            lineTo(10.47f, 6.03f)
            lineTo(15.69f, 11.25f)
            horizontalLineTo(3.75f)
            curveTo(3.37f, 11.25f, 3.057f, 11.532f, 3.007f, 11.898f)
            lineTo(3f, 12f)
            curveTo(3f, 12.38f, 3.282f, 12.693f, 3.648f, 12.743f)
            lineTo(3.75f, 12.75f)
            horizontalLineTo(15.69f)
            lineTo(10.47f, 17.97f)
            curveTo(10.203f, 18.236f, 10.179f, 18.653f, 10.397f, 18.946f)
            lineTo(10.47f, 19.03f)
            curveTo(10.736f, 19.297f, 11.153f, 19.321f, 11.446f, 19.103f)
            lineTo(11.53f, 19.03f)
            lineTo(18.03f, 12.53f)
            curveTo(18.297f, 12.264f, 18.321f, 11.847f, 18.103f, 11.554f)
            lineTo(18.03f, 11.47f)
            lineTo(11.53f, 4.97f)
            lineTo(18.03f, 11.47f)
            close()
            moveTo(21f, 18.5f)
            verticalLineTo(5.5f)
            curveTo(21f, 5.086f, 20.664f, 4.75f, 20.25f, 4.75f)
            curveTo(19.836f, 4.75f, 19.5f, 5.086f, 19.5f, 5.5f)
            verticalLineTo(18.5f)
            curveTo(19.5f, 18.914f, 19.836f, 19.25f, 20.25f, 19.25f)
            curveTo(20.664f, 19.25f, 21f, 18.914f, 21f, 18.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun KeyboardTabPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.KeyboardTab, contentDescription = null)
    }
}
