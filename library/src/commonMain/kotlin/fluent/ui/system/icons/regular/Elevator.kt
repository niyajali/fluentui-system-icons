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
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.Elevator: ImageVector
    get() {
        if (_Elevator != null) {
            return _Elevator!!
        }
        _Elevator = ImageVector.Builder(
            name = "Regular.Elevator",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(8.03f, 8.97f)
                curveTo(7.737f, 8.677f, 7.263f, 8.677f, 6.97f, 8.97f)
                lineTo(5.22f, 10.72f)
                curveTo(4.927f, 11.013f, 4.927f, 11.487f, 5.22f, 11.78f)
                curveTo(5.513f, 12.073f, 5.987f, 12.073f, 6.28f, 11.78f)
                lineTo(6.75f, 11.311f)
                verticalLineTo(14.25f)
                curveTo(6.75f, 14.664f, 7.086f, 15f, 7.5f, 15f)
                curveTo(7.914f, 15f, 8.25f, 14.664f, 8.25f, 14.25f)
                verticalLineTo(11.311f)
                lineTo(8.72f, 11.78f)
                curveTo(9.013f, 12.073f, 9.487f, 12.073f, 9.78f, 11.78f)
                curveTo(10.073f, 11.487f, 10.073f, 11.013f, 9.78f, 10.72f)
                lineTo(8.03f, 8.97f)
                close()
                moveTo(14.22f, 13.03f)
                lineTo(15.97f, 14.78f)
                curveTo(16.263f, 15.073f, 16.737f, 15.073f, 17.03f, 14.78f)
                lineTo(18.78f, 13.03f)
                curveTo(19.073f, 12.737f, 19.073f, 12.263f, 18.78f, 11.97f)
                curveTo(18.487f, 11.677f, 18.013f, 11.677f, 17.72f, 11.97f)
                lineTo(17.25f, 12.439f)
                verticalLineTo(9.5f)
                curveTo(17.25f, 9.086f, 16.914f, 8.75f, 16.5f, 8.75f)
                curveTo(16.086f, 8.75f, 15.75f, 9.086f, 15.75f, 9.5f)
                verticalLineTo(12.439f)
                lineTo(15.28f, 11.97f)
                curveTo(14.987f, 11.677f, 14.513f, 11.677f, 14.22f, 11.97f)
                curveTo(13.927f, 12.263f, 13.927f, 12.737f, 14.22f, 13.03f)
                close()
                moveTo(5.25f, 4f)
                curveTo(3.455f, 4f, 2f, 5.455f, 2f, 7.25f)
                verticalLineTo(16.75f)
                curveTo(2f, 18.545f, 3.455f, 20f, 5.25f, 20f)
                horizontalLineTo(18.75f)
                curveTo(20.545f, 20f, 22f, 18.545f, 22f, 16.75f)
                verticalLineTo(7.25f)
                curveTo(22f, 5.455f, 20.545f, 4f, 18.75f, 4f)
                horizontalLineTo(5.25f)
                close()
                moveTo(3.5f, 7.25f)
                curveTo(3.5f, 6.284f, 4.284f, 5.5f, 5.25f, 5.5f)
                horizontalLineTo(11.25f)
                lineTo(11.25f, 18.5f)
                horizontalLineTo(5.25f)
                curveTo(4.284f, 18.5f, 3.5f, 17.716f, 3.5f, 16.75f)
                verticalLineTo(7.25f)
                close()
                moveTo(12.75f, 5.5f)
                horizontalLineTo(18.75f)
                curveTo(19.716f, 5.5f, 20.5f, 6.284f, 20.5f, 7.25f)
                verticalLineTo(16.75f)
                curveTo(20.5f, 17.716f, 19.716f, 18.5f, 18.75f, 18.5f)
                horizontalLineTo(12.75f)
                lineTo(12.75f, 5.5f)
                close()
            }
        }.build()

        return _Elevator!!
    }

@Suppress("ObjectPropertyName")
private var _Elevator: ImageVector? = null

@Preview
@Composable
private fun ElevatorPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Elevator, contentDescription = null)
    }
}
