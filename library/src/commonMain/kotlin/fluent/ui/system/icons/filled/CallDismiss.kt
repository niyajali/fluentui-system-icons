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

public val FluentIcons.Filled.CallDismiss: ImageVector
    get() {
        if (_CallDismiss != null) {
            return _CallDismiss!!
        }
        _CallDismiss = ImageVector.Builder(
            name = "Filled.CallDismiss",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(21.781f, 2.22f)
                curveTo(22.073f, 2.513f, 22.073f, 2.987f, 21.781f, 3.28f)
                lineTo(18.561f, 6.5f)
                lineTo(21.781f, 9.72f)
                curveTo(22.073f, 10.013f, 22.073f, 10.487f, 21.781f, 10.78f)
                curveTo(21.488f, 11.073f, 21.013f, 11.073f, 20.72f, 10.78f)
                lineTo(17.5f, 7.561f)
                lineTo(14.281f, 10.78f)
                curveTo(13.988f, 11.073f, 13.513f, 11.073f, 13.22f, 10.78f)
                curveTo(12.927f, 10.487f, 12.927f, 10.013f, 13.22f, 9.72f)
                lineTo(16.44f, 6.5f)
                lineTo(13.22f, 3.28f)
                curveTo(12.927f, 2.987f, 12.927f, 2.513f, 13.22f, 2.22f)
                curveTo(13.513f, 1.927f, 13.988f, 1.927f, 14.281f, 2.22f)
                lineTo(17.5f, 5.439f)
                lineTo(20.72f, 2.22f)
                curveTo(21.013f, 1.927f, 21.488f, 1.927f, 21.781f, 2.22f)
                close()
                moveTo(9.367f, 3.312f)
                lineTo(10.227f, 5.34f)
                curveTo(10.602f, 6.223f, 10.394f, 7.262f, 9.713f, 7.908f)
                lineTo(7.819f, 9.706f)
                curveTo(7.936f, 10.782f, 8.297f, 11.841f, 8.903f, 12.883f)
                curveTo(9.509f, 13.926f, 10.267f, 14.79f, 11.174f, 15.478f)
                lineTo(13.45f, 14.719f)
                curveTo(14.312f, 14.431f, 15.251f, 14.762f, 15.78f, 15.539f)
                lineTo(17.013f, 17.35f)
                curveTo(17.628f, 18.253f, 17.517f, 19.499f, 16.754f, 20.265f)
                lineTo(15.936f, 21.086f)
                curveTo(15.122f, 21.903f, 13.96f, 22.2f, 12.884f, 21.864f)
                curveTo(10.345f, 21.072f, 8.011f, 18.721f, 5.881f, 14.811f)
                curveTo(3.748f, 10.894f, 2.996f, 7.572f, 3.623f, 4.843f)
                curveTo(3.887f, 3.695f, 4.705f, 2.78f, 5.772f, 2.439f)
                lineTo(6.849f, 2.095f)
                curveTo(7.858f, 1.773f, 8.935f, 2.294f, 9.367f, 3.312f)
                close()
            }
        }.build()

        return _CallDismiss!!
    }

@Suppress("ObjectPropertyName")
private var _CallDismiss: ImageVector? = null

@Preview
@Composable
private fun CallDismissPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CallDismiss, contentDescription = null)
    }
}
