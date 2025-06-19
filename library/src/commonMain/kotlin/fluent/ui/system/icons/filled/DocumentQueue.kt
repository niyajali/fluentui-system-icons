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

public val FluentIcons.Filled.DocumentQueue: ImageVector
    get() {
        if (_DocumentQueue != null) {
            return _DocumentQueue!!
        }
        _DocumentQueue = ImageVector.Builder(
            name = "Filled.DocumentQueue",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(7f, 2f)
                curveTo(5.895f, 2f, 5f, 2.895f, 5f, 4f)
                verticalLineTo(17f)
                curveTo(5f, 18.105f, 5.895f, 19f, 7f, 19f)
                horizontalLineTo(17f)
                curveTo(18.105f, 19f, 19f, 18.105f, 19f, 17f)
                verticalLineTo(8.5f)
                horizontalLineTo(14.25f)
                curveTo(13.283f, 8.5f, 12.5f, 7.716f, 12.5f, 6.75f)
                lineTo(12.5f, 2f)
                horizontalLineTo(7f)
                close()
                moveTo(8.75f, 5f)
                horizontalLineTo(10.25f)
                curveTo(10.664f, 5f, 11f, 5.336f, 11f, 5.75f)
                curveTo(11f, 6.164f, 10.664f, 6.5f, 10.25f, 6.5f)
                horizontalLineTo(8.75f)
                curveTo(8.336f, 6.5f, 8f, 6.164f, 8f, 5.75f)
                curveTo(8f, 5.336f, 8.336f, 5f, 8.75f, 5f)
                close()
                moveTo(8f, 8.75f)
                curveTo(8f, 8.336f, 8.336f, 8f, 8.75f, 8f)
                horizontalLineTo(10.25f)
                curveTo(10.664f, 8f, 11f, 8.336f, 11f, 8.75f)
                curveTo(11f, 9.164f, 10.664f, 9.5f, 10.25f, 9.5f)
                horizontalLineTo(8.75f)
                curveTo(8.336f, 9.5f, 8f, 9.164f, 8f, 8.75f)
                close()
                moveTo(8.75f, 11f)
                horizontalLineTo(10.25f)
                curveTo(10.664f, 11f, 11f, 11.336f, 11f, 11.75f)
                curveTo(11f, 12.164f, 10.664f, 12.5f, 10.25f, 12.5f)
                horizontalLineTo(8.75f)
                curveTo(8.336f, 12.5f, 8f, 12.164f, 8f, 11.75f)
                curveTo(8f, 11.336f, 8.336f, 11f, 8.75f, 11f)
                close()
                moveTo(14f, 2.002f)
                lineTo(19f, 7f)
                horizontalLineTo(14.25f)
                curveTo(14.112f, 7f, 14f, 6.888f, 14f, 6.75f)
                lineTo(14f, 2.002f)
                close()
                moveTo(2.75f, 15f)
                curveTo(3.164f, 15f, 3.5f, 15.336f, 3.5f, 15.75f)
                verticalLineTo(17.5f)
                curveTo(3.5f, 19.157f, 4.843f, 20.5f, 6.5f, 20.5f)
                horizontalLineTo(17.5f)
                curveTo(19.157f, 20.5f, 20.5f, 19.157f, 20.5f, 17.5f)
                verticalLineTo(15.75f)
                curveTo(20.5f, 15.336f, 20.836f, 15f, 21.25f, 15f)
                curveTo(21.664f, 15f, 22f, 15.336f, 22f, 15.75f)
                verticalLineTo(17.5f)
                curveTo(22f, 19.985f, 19.985f, 22f, 17.5f, 22f)
                horizontalLineTo(6.5f)
                curveTo(4.015f, 22f, 2f, 19.985f, 2f, 17.5f)
                verticalLineTo(15.75f)
                curveTo(2f, 15.336f, 2.336f, 15f, 2.75f, 15f)
                close()
                moveTo(12.5f, 2f)
                lineTo(13.998f, 2f)
                close()
            }
        }.build()

        return _DocumentQueue!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentQueue: ImageVector? = null

@Preview
@Composable
private fun DocumentQueuePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DocumentQueue, contentDescription = null)
    }
}
