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

public val FluentIcons.Regular.SelectAllOn: ImageVector
    get() {
        if (_SelectAllOn != null) {
            return _SelectAllOn!!
        }
        _SelectAllOn = ImageVector.Builder(
            name = "Regular.SelectAllOn",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(15.28f, 9.03f)
                curveTo(15.573f, 8.737f, 15.573f, 8.263f, 15.28f, 7.97f)
                curveTo(14.987f, 7.677f, 14.513f, 7.677f, 14.22f, 7.97f)
                lineTo(10f, 12.189f)
                lineTo(8.03f, 10.22f)
                curveTo(7.737f, 9.927f, 7.263f, 9.927f, 6.97f, 10.22f)
                curveTo(6.677f, 10.513f, 6.677f, 10.987f, 6.97f, 11.28f)
                lineTo(9.47f, 13.78f)
                curveTo(9.763f, 14.073f, 10.237f, 14.073f, 10.53f, 13.78f)
                lineTo(15.28f, 9.03f)
                close()
                moveTo(3f, 6.25f)
                curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
                horizontalLineTo(15.75f)
                curveTo(17.545f, 3f, 19f, 4.455f, 19f, 6.25f)
                verticalLineTo(15.75f)
                curveTo(19f, 17.545f, 17.545f, 19f, 15.75f, 19f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 19f, 3f, 17.545f, 3f, 15.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(6.25f, 4.5f)
                curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
                verticalLineTo(15.75f)
                curveTo(4.5f, 16.716f, 5.284f, 17.5f, 6.25f, 17.5f)
                horizontalLineTo(15.75f)
                curveTo(16.716f, 17.5f, 17.5f, 16.716f, 17.5f, 15.75f)
                verticalLineTo(6.25f)
                curveTo(17.5f, 5.284f, 16.716f, 4.5f, 15.75f, 4.5f)
                horizontalLineTo(6.25f)
                close()
                moveTo(9.241f, 21.5f)
                curveTo(8.09f, 21.5f, 7.078f, 20.902f, 6.5f, 19.999f)
                horizontalLineTo(9.216f)
                lineTo(9.241f, 19.999f)
                horizontalLineTo(16.246f)
                curveTo(18.319f, 19.999f, 19.999f, 18.319f, 19.999f, 16.246f)
                verticalLineTo(6.5f)
                curveTo(20.902f, 7.078f, 21.5f, 8.09f, 21.5f, 9.241f)
                verticalLineTo(16.246f)
                curveTo(21.5f, 19.148f, 19.148f, 21.5f, 16.246f, 21.5f)
                horizontalLineTo(9.241f)
                close()
            }
        }.build()

        return _SelectAllOn!!
    }

@Suppress("ObjectPropertyName")
private var _SelectAllOn: ImageVector? = null

@Preview
@Composable
private fun SelectAllOnPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.SelectAllOn, contentDescription = null)
    }
}
