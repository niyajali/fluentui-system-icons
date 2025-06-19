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

public val FluentIcons.Regular.Luggage: ImageVector
    get() {
        if (_Luggage != null) {
            return _Luggage!!
        }
        _Luggage = ImageVector.Builder(
            name = "Regular.Luggage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(8.75f, 2f)
                curveTo(8.336f, 2f, 8f, 2.336f, 8f, 2.75f)
                curveTo(8f, 3.164f, 8.336f, 3.5f, 8.75f, 3.5f)
                horizontalLineTo(9f)
                verticalLineTo(5f)
                horizontalLineTo(8.25f)
                curveTo(6.455f, 5f, 5f, 6.455f, 5f, 8.25f)
                verticalLineTo(17.25f)
                curveTo(5f, 18.602f, 5.826f, 19.761f, 7f, 20.251f)
                verticalLineTo(21.25f)
                curveTo(7f, 21.664f, 7.336f, 22f, 7.75f, 22f)
                curveTo(8.164f, 22f, 8.5f, 21.664f, 8.5f, 21.25f)
                verticalLineTo(20.5f)
                horizontalLineTo(15.5f)
                verticalLineTo(21.25f)
                curveTo(15.5f, 21.664f, 15.836f, 22f, 16.25f, 22f)
                curveTo(16.664f, 22f, 17f, 21.664f, 17f, 21.25f)
                verticalLineTo(20.251f)
                curveTo(18.174f, 19.761f, 19f, 18.602f, 19f, 17.25f)
                verticalLineTo(8.25f)
                curveTo(19f, 6.455f, 17.545f, 5f, 15.75f, 5f)
                horizontalLineTo(15f)
                verticalLineTo(3.5f)
                horizontalLineTo(15.25f)
                curveTo(15.664f, 3.5f, 16f, 3.164f, 16f, 2.75f)
                curveTo(16f, 2.336f, 15.664f, 2f, 15.25f, 2f)
                horizontalLineTo(8.75f)
                close()
                moveTo(13.5f, 3.5f)
                verticalLineTo(5f)
                horizontalLineTo(10.5f)
                verticalLineTo(3.5f)
                horizontalLineTo(13.5f)
                close()
                moveTo(8.25f, 6.5f)
                horizontalLineTo(15.75f)
                curveTo(16.716f, 6.5f, 17.5f, 7.284f, 17.5f, 8.25f)
                verticalLineTo(17.25f)
                curveTo(17.5f, 18.216f, 16.716f, 19f, 15.75f, 19f)
                horizontalLineTo(8.25f)
                curveTo(7.284f, 19f, 6.5f, 18.216f, 6.5f, 17.25f)
                verticalLineTo(8.25f)
                curveTo(6.5f, 7.284f, 7.284f, 6.5f, 8.25f, 6.5f)
                close()
                moveTo(8f, 9.75f)
                curveTo(8f, 9.336f, 8.336f, 9f, 8.75f, 9f)
                horizontalLineTo(15.25f)
                curveTo(15.664f, 9f, 16f, 9.336f, 16f, 9.75f)
                curveTo(16f, 10.164f, 15.664f, 10.5f, 15.25f, 10.5f)
                horizontalLineTo(8.75f)
                curveTo(8.336f, 10.5f, 8f, 10.164f, 8f, 9.75f)
                close()
            }
        }.build()

        return _Luggage!!
    }

@Suppress("ObjectPropertyName")
private var _Luggage: ImageVector? = null

@Preview
@Composable
private fun LuggagePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Luggage, contentDescription = null)
    }
}
