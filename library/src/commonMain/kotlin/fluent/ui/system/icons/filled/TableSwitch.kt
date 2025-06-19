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

public val FluentIcons.Filled.TableSwitch: ImageVector
    get() {
        if (_TableSwitch != null) {
            return _TableSwitch!!
        }
        _TableSwitch = ImageVector.Builder(
            name = "Filled.TableSwitch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(8.78f, 1.22f)
                curveTo(8.487f, 0.927f, 8.013f, 0.927f, 7.72f, 1.22f)
                curveTo(7.427f, 1.513f, 7.427f, 1.987f, 7.72f, 2.28f)
                lineTo(8.439f, 3f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
                verticalLineTo(8.439f)
                lineTo(2.28f, 7.72f)
                curveTo(1.987f, 7.427f, 1.513f, 7.427f, 1.22f, 7.72f)
                curveTo(0.927f, 8.013f, 0.927f, 8.487f, 1.22f, 8.78f)
                lineTo(3.22f, 10.78f)
                curveTo(3.513f, 11.073f, 3.987f, 11.073f, 4.28f, 10.78f)
                lineTo(6.28f, 8.78f)
                curveTo(6.573f, 8.487f, 6.573f, 8.013f, 6.28f, 7.72f)
                curveTo(5.987f, 7.427f, 5.513f, 7.427f, 5.22f, 7.72f)
                lineTo(4.5f, 8.439f)
                verticalLineTo(6.25f)
                curveTo(4.5f, 5.284f, 5.284f, 4.5f, 6.25f, 4.5f)
                horizontalLineTo(8.439f)
                lineTo(7.72f, 5.22f)
                curveTo(7.427f, 5.513f, 7.427f, 5.987f, 7.72f, 6.28f)
                curveTo(8.013f, 6.573f, 8.487f, 6.573f, 8.78f, 6.28f)
                lineTo(10.78f, 4.28f)
                curveTo(11.073f, 3.987f, 11.073f, 3.513f, 10.78f, 3.22f)
                lineTo(8.78f, 1.22f)
                close()
                moveTo(14.5f, 8f)
                horizontalLineTo(9.502f)
                verticalLineTo(6.973f)
                lineTo(11.487f, 4.987f)
                curveTo(12.025f, 4.45f, 12.14f, 3.65f, 11.832f, 3f)
                horizontalLineTo(14.5f)
                verticalLineTo(8f)
                close()
                moveTo(3f, 11.832f)
                verticalLineTo(14.5f)
                horizontalLineTo(8f)
                lineTo(8f, 9.5f)
                horizontalLineTo(6.975f)
                lineTo(4.987f, 11.487f)
                curveTo(4.45f, 12.025f, 3.65f, 12.14f, 3f, 11.832f)
                close()
                moveTo(14.5f, 14.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(14.5f)
                lineTo(14.5f, 14.5f)
                close()
                moveTo(16f, 14.5f)
                verticalLineTo(9.5f)
                lineTo(21f, 9.5f)
                verticalLineTo(14.5f)
                horizontalLineTo(16f)
                close()
                moveTo(16f, 8f)
                lineTo(21f, 8f)
                verticalLineTo(6.25f)
                curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                close()
                moveTo(14.5f, 21f)
                verticalLineTo(16f)
                lineTo(9.5f, 16f)
                verticalLineTo(21f)
                horizontalLineTo(14.5f)
                close()
                moveTo(8f, 16f)
                horizontalLineTo(3f)
                verticalLineTo(17.75f)
                curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
                horizontalLineTo(8f)
                verticalLineTo(16f)
                close()
                moveTo(16f, 16f)
                horizontalLineTo(21f)
                verticalLineTo(17.75f)
                curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
                horizontalLineTo(16f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _TableSwitch!!
    }

@Suppress("ObjectPropertyName")
private var _TableSwitch: ImageVector? = null

@Preview
@Composable
private fun TableSwitchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TableSwitch, contentDescription = null)
    }
}
