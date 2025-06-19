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

public val FluentIcons.Filled.TaskListSquareLtr: ImageVector
    get() {
        if (_TaskListSquareLtr != null) {
            return _TaskListSquareLtr!!
        }
        _TaskListSquareLtr = ImageVector.Builder(
            name = "Filled.TaskListSquareLtr",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3f, 6.25f)
                curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(12.5f, 9.25f)
                curveTo(12.5f, 9.664f, 12.836f, 10f, 13.25f, 10f)
                horizontalLineTo(16.75f)
                curveTo(17.164f, 10f, 17.5f, 9.664f, 17.5f, 9.25f)
                curveTo(17.5f, 8.836f, 17.164f, 8.5f, 16.75f, 8.5f)
                horizontalLineTo(13.25f)
                curveTo(12.836f, 8.5f, 12.5f, 8.836f, 12.5f, 9.25f)
                close()
                moveTo(13.25f, 14f)
                curveTo(12.836f, 14f, 12.5f, 14.336f, 12.5f, 14.75f)
                curveTo(12.5f, 15.164f, 12.836f, 15.5f, 13.25f, 15.5f)
                horizontalLineTo(16.75f)
                curveTo(17.164f, 15.5f, 17.5f, 15.164f, 17.5f, 14.75f)
                curveTo(17.5f, 14.336f, 17.164f, 14f, 16.75f, 14f)
                horizontalLineTo(13.25f)
                close()
                moveTo(10.78f, 8.78f)
                curveTo(11.073f, 8.487f, 11.073f, 8.013f, 10.78f, 7.72f)
                curveTo(10.487f, 7.427f, 10.013f, 7.427f, 9.72f, 7.72f)
                lineTo(8.25f, 9.189f)
                lineTo(7.78f, 8.72f)
                curveTo(7.487f, 8.427f, 7.013f, 8.427f, 6.72f, 8.72f)
                curveTo(6.427f, 9.013f, 6.427f, 9.487f, 6.72f, 9.78f)
                lineTo(7.72f, 10.78f)
                curveTo(8.013f, 11.073f, 8.487f, 11.073f, 8.78f, 10.78f)
                lineTo(10.78f, 8.78f)
                close()
                moveTo(10.78f, 13.22f)
                curveTo(10.487f, 12.927f, 10.013f, 12.927f, 9.72f, 13.22f)
                lineTo(8.25f, 14.689f)
                lineTo(7.78f, 14.22f)
                curveTo(7.487f, 13.927f, 7.013f, 13.927f, 6.72f, 14.22f)
                curveTo(6.427f, 14.513f, 6.427f, 14.987f, 6.72f, 15.28f)
                lineTo(7.72f, 16.28f)
                curveTo(8.013f, 16.573f, 8.487f, 16.573f, 8.78f, 16.28f)
                lineTo(10.78f, 14.28f)
                curveTo(11.073f, 13.987f, 11.073f, 13.513f, 10.78f, 13.22f)
                close()
            }
        }.build()

        return _TaskListSquareLtr!!
    }

@Suppress("ObjectPropertyName")
private var _TaskListSquareLtr: ImageVector? = null

@Preview
@Composable
private fun TaskListSquareLtrPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TaskListSquareLtr, contentDescription = null)
    }
}
