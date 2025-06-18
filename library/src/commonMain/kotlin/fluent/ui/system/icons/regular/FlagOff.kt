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

public val FluentUi.Regular.FlagOff: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.FlagOff",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2.5f, 2.501f)
            lineTo(20.5f, 20.501f)
            curveTo(20.793f, 20.794f, 20.793f, 21.269f, 20.5f, 21.562f)
            curveTo(20.207f, 21.854f, 19.732f, 21.854f, 19.439f, 21.562f)
            lineTo(14.377f, 16.499f)
            lineTo(4.5f, 16.5f)
            verticalLineTo(21.25f)
            curveTo(4.5f, 21.63f, 4.218f, 21.944f, 3.852f, 21.993f)
            lineTo(3.75f, 22f)
            curveTo(3.37f, 22f, 3.057f, 21.718f, 3.007f, 21.352f)
            lineTo(3f, 21.25f)
            lineTo(3f, 5.122f)
            lineTo(1.439f, 3.562f)
            curveTo(1.146f, 3.269f, 1.146f, 2.794f, 1.439f, 2.501f)
            curveTo(1.732f, 2.208f, 2.207f, 2.208f, 2.5f, 2.501f)
            close()
            moveTo(5.117f, 2.998f)
            lineTo(20.254f, 2.998f)
            curveTo(20.872f, 2.998f, 21.225f, 3.704f, 20.854f, 4.199f)
            lineTo(16.69f, 9.75f)
            lineTo(20.854f, 15.301f)
            curveTo(21.225f, 15.795f, 20.872f, 16.501f, 20.254f, 16.501f)
            lineTo(18.62f, 16.5f)
            lineTo(17.12f, 15f)
            lineTo(18.754f, 15.001f)
            lineTo(15.152f, 10.2f)
            curveTo(14.952f, 9.933f, 14.952f, 9.566f, 15.152f, 9.3f)
            lineTo(18.754f, 4.498f)
            lineTo(6.617f, 4.498f)
            lineTo(5.117f, 2.998f)
            close()
            moveTo(4.5f, 6.622f)
            lineTo(4.5f, 15.001f)
            lineTo(12.877f, 14.999f)
            lineTo(4.5f, 6.622f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FlagOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.FlagOff, contentDescription = null)
    }
}
