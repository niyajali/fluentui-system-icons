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

public val FluentIcons.Filled.GroupList: ImageVector
    get() {
        if (_GroupList != null) {
            return _GroupList!!
        }
        _GroupList = ImageVector.Builder(
            name = "Filled.GroupList",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3.001f, 11.996f)
                lineTo(6.001f, 12f)
                curveTo(6.554f, 12.001f, 7.001f, 12.449f, 7f, 13.001f)
                curveTo(6.999f, 13.514f, 6.613f, 13.936f, 6.115f, 13.993f)
                lineTo(5.999f, 14f)
                lineTo(4f, 13.996f)
                verticalLineTo(18.999f)
                lineTo(6f, 19f)
                curveTo(6.513f, 19f, 6.936f, 19.386f, 6.993f, 19.883f)
                lineTo(7f, 20f)
                curveTo(7f, 20.513f, 6.614f, 20.935f, 6.117f, 20.993f)
                lineTo(6f, 21f)
                horizontalLineTo(3f)
                curveTo(2.487f, 21f, 2.064f, 20.614f, 2.007f, 20.117f)
                lineTo(2f, 20f)
                verticalLineTo(12.996f)
                curveTo(2f, 12.483f, 2.387f, 12.06f, 2.885f, 12.002f)
                lineTo(3.001f, 11.996f)
                close()
                moveTo(21f, 17f)
                curveTo(21.552f, 17f, 22f, 17.448f, 22f, 18f)
                curveTo(22f, 18.513f, 21.614f, 18.935f, 21.117f, 18.993f)
                lineTo(21f, 19f)
                horizontalLineTo(9f)
                curveTo(8.448f, 19f, 8f, 18.552f, 8f, 18f)
                curveTo(8f, 17.487f, 8.386f, 17.065f, 8.883f, 17.007f)
                lineTo(9f, 17f)
                horizontalLineTo(21f)
                close()
                moveTo(21f, 14f)
                curveTo(21.552f, 14f, 22f, 14.448f, 22f, 15f)
                curveTo(22f, 15.513f, 21.614f, 15.936f, 21.117f, 15.993f)
                lineTo(21f, 16f)
                horizontalLineTo(9f)
                curveTo(8.448f, 16f, 8f, 15.552f, 8f, 15f)
                curveTo(8f, 14.487f, 8.386f, 14.064f, 8.883f, 14.007f)
                lineTo(9f, 14f)
                horizontalLineTo(21f)
                close()
                moveTo(6f, 2f)
                curveTo(6.552f, 2f, 7f, 2.448f, 7f, 3f)
                curveTo(7f, 3.513f, 6.614f, 3.936f, 6.117f, 3.993f)
                lineTo(6f, 4f)
                horizontalLineTo(4f)
                verticalLineTo(8.995f)
                lineTo(6f, 8.995f)
                curveTo(6.513f, 8.995f, 6.936f, 9.381f, 6.993f, 9.878f)
                lineTo(7f, 9.995f)
                curveTo(7f, 10.508f, 6.614f, 10.931f, 6.117f, 10.988f)
                lineTo(6f, 10.995f)
                horizontalLineTo(3f)
                curveTo(2.487f, 10.995f, 2.064f, 10.609f, 2.007f, 10.112f)
                lineTo(2f, 9.995f)
                verticalLineTo(3f)
                curveTo(2f, 2.487f, 2.386f, 2.064f, 2.883f, 2.007f)
                lineTo(3f, 2f)
                horizontalLineTo(6f)
                close()
                moveTo(21f, 7f)
                curveTo(21.552f, 7f, 22f, 7.448f, 22f, 8f)
                curveTo(22f, 8.513f, 21.614f, 8.936f, 21.117f, 8.993f)
                lineTo(21f, 9f)
                horizontalLineTo(9f)
                curveTo(8.448f, 9f, 8f, 8.552f, 8f, 8f)
                curveTo(8f, 7.487f, 8.386f, 7.064f, 8.883f, 7.007f)
                lineTo(9f, 7f)
                horizontalLineTo(21f)
                close()
                moveTo(21f, 4f)
                curveTo(21.552f, 4f, 22f, 4.448f, 22f, 5f)
                curveTo(22f, 5.513f, 21.614f, 5.936f, 21.117f, 5.993f)
                lineTo(21f, 6f)
                horizontalLineTo(9f)
                curveTo(8.448f, 6f, 8f, 5.552f, 8f, 5f)
                curveTo(8f, 4.487f, 8.386f, 4.064f, 8.883f, 4.007f)
                lineTo(9f, 4f)
                horizontalLineTo(21f)
                close()
            }
        }.build()

        return _GroupList!!
    }

@Suppress("ObjectPropertyName")
private var _GroupList: ImageVector? = null

@Preview
@Composable
private fun GroupListPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.GroupList, contentDescription = null)
    }
}
