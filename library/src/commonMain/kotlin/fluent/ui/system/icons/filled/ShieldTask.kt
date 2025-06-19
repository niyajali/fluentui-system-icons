package fluent.ui.system.icons.filled

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
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.ShieldTask: ImageVector
    get() {
        if (_ShieldTask != null) {
            return _ShieldTask!!
        }
        _ShieldTask = ImageVector.Builder(
            name = "Filled.ShieldTask",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(20.25f, 5f)
                curveTo(17.587f, 5f, 14.992f, 4.057f, 12.45f, 2.15f)
                curveTo(12.183f, 1.95f, 11.817f, 1.95f, 11.55f, 2.15f)
                curveTo(9.008f, 4.057f, 6.413f, 5f, 3.75f, 5f)
                curveTo(3.336f, 5f, 3f, 5.336f, 3f, 5.75f)
                verticalLineTo(11f)
                curveTo(3f, 16.001f, 5.958f, 19.676f, 11.725f, 21.948f)
                curveTo(11.902f, 22.017f, 12.098f, 22.017f, 12.275f, 21.948f)
                curveTo(18.042f, 19.676f, 21f, 16.001f, 21f, 11f)
                verticalLineTo(5.75f)
                curveTo(21f, 5.336f, 20.664f, 5f, 20.25f, 5f)
                close()
                moveTo(16.757f, 9.303f)
                lineTo(10.757f, 14.803f)
                curveTo(10.461f, 15.074f, 10.004f, 15.064f, 9.72f, 14.78f)
                lineTo(7.22f, 12.28f)
                curveTo(6.927f, 11.987f, 6.927f, 11.513f, 7.22f, 11.22f)
                curveTo(7.513f, 10.927f, 7.987f, 10.927f, 8.28f, 11.22f)
                lineTo(10.273f, 13.212f)
                lineTo(15.743f, 8.197f)
                curveTo(16.049f, 7.917f, 16.523f, 7.938f, 16.803f, 8.243f)
                curveTo(17.083f, 8.549f, 17.062f, 9.023f, 16.757f, 9.303f)
                close()
            }
        }.build()

        return _ShieldTask!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldTask: ImageVector? = null

@Preview
@Composable
private fun ShieldTaskPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ShieldTask, contentDescription = null)
    }
}
