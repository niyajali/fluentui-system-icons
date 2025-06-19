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

public val FluentIcons.Regular.CloudBidirectional: ImageVector
    get() {
        if (_CloudBidirectional != null) {
            return _CloudBidirectional!!
        }
        _CloudBidirectional = ImageVector.Builder(
            name = "Regular.CloudBidirectional",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 3.5f)
                curveTo(9.587f, 3.5f, 7.617f, 5.4f, 7.505f, 7.785f)
                curveTo(7.486f, 8.185f, 7.156f, 8.5f, 6.756f, 8.5f)
                horizontalLineTo(6.5f)
                curveTo(4.843f, 8.5f, 3.5f, 9.843f, 3.5f, 11.5f)
                curveTo(3.5f, 13.157f, 4.843f, 14.5f, 6.5f, 14.5f)
                horizontalLineTo(10f)
                verticalLineTo(16f)
                horizontalLineTo(6.5f)
                curveTo(4.015f, 16f, 2f, 13.985f, 2f, 11.5f)
                curveTo(2f, 9.156f, 3.792f, 7.231f, 6.08f, 7.019f)
                curveTo(6.548f, 4.172f, 9.02f, 2f, 12f, 2f)
                curveTo(14.98f, 2f, 17.452f, 4.172f, 17.92f, 7.019f)
                curveTo(20.208f, 7.231f, 22f, 9.156f, 22f, 11.5f)
                curveTo(22f, 13.985f, 19.985f, 16f, 17.5f, 16f)
                horizontalLineTo(13.5f)
                verticalLineTo(14.5f)
                horizontalLineTo(17.5f)
                curveTo(19.157f, 14.5f, 20.5f, 13.157f, 20.5f, 11.5f)
                curveTo(20.5f, 9.843f, 19.157f, 8.5f, 17.5f, 8.5f)
                horizontalLineTo(17.244f)
                curveTo(16.844f, 8.5f, 16.514f, 8.185f, 16.495f, 7.785f)
                curveTo(16.383f, 5.4f, 14.413f, 3.5f, 12f, 3.5f)
                close()
                moveTo(14.78f, 11.78f)
                curveTo(14.487f, 12.073f, 14.013f, 12.073f, 13.72f, 11.78f)
                lineTo(12.5f, 10.561f)
                verticalLineTo(19.439f)
                lineTo(13.72f, 18.22f)
                curveTo(14.013f, 17.927f, 14.487f, 17.927f, 14.78f, 18.22f)
                curveTo(15.073f, 18.513f, 15.073f, 18.987f, 14.78f, 19.28f)
                lineTo(12.28f, 21.78f)
                curveTo(11.987f, 22.073f, 11.513f, 22.073f, 11.22f, 21.78f)
                lineTo(8.72f, 19.28f)
                curveTo(8.427f, 18.987f, 8.427f, 18.513f, 8.72f, 18.22f)
                curveTo(9.013f, 17.927f, 9.487f, 17.927f, 9.78f, 18.22f)
                lineTo(11f, 19.439f)
                verticalLineTo(10.561f)
                lineTo(9.78f, 11.78f)
                curveTo(9.487f, 12.073f, 9.013f, 12.073f, 8.72f, 11.78f)
                curveTo(8.427f, 11.487f, 8.427f, 11.013f, 8.72f, 10.72f)
                lineTo(11.22f, 8.22f)
                curveTo(11.513f, 7.927f, 11.987f, 7.927f, 12.28f, 8.22f)
                lineTo(14.78f, 10.72f)
                curveTo(15.073f, 11.013f, 15.073f, 11.487f, 14.78f, 11.78f)
                close()
            }
        }.build()

        return _CloudBidirectional!!
    }

@Suppress("ObjectPropertyName")
private var _CloudBidirectional: ImageVector? = null

@Preview
@Composable
private fun CloudBidirectionalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CloudBidirectional, contentDescription = null)
    }
}
