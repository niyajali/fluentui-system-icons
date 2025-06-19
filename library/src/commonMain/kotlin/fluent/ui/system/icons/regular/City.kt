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

public val FluentIcons.Regular.City: ImageVector
    get() {
        if (_City != null) {
            return _City!!
        }
        _City = ImageVector.Builder(
            name = "Regular.City",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 1.996f)
                curveTo(12.414f, 1.996f, 12.75f, 2.332f, 12.75f, 2.746f)
                verticalLineTo(3.999f)
                horizontalLineTo(14.75f)
                curveTo(15.717f, 3.999f, 16.5f, 4.783f, 16.5f, 5.749f)
                verticalLineTo(10.999f)
                horizontalLineTo(18.75f)
                curveTo(19.716f, 10.999f, 20.5f, 11.783f, 20.5f, 12.749f)
                verticalLineTo(20.249f)
                curveTo(20.5f, 21.216f, 19.716f, 21.999f, 18.75f, 21.999f)
                horizontalLineTo(9.755f)
                lineTo(9.75f, 21.999f)
                horizontalLineTo(5.25f)
                curveTo(4.284f, 21.999f, 3.5f, 21.216f, 3.5f, 20.249f)
                verticalLineTo(11.82f)
                curveTo(3.5f, 11.201f, 3.827f, 10.628f, 4.36f, 10.313f)
                lineTo(7.5f, 8.458f)
                verticalLineTo(5.749f)
                curveTo(7.5f, 4.783f, 8.283f, 3.999f, 9.25f, 3.999f)
                horizontalLineTo(11.25f)
                verticalLineTo(2.746f)
                curveTo(11.25f, 2.332f, 11.586f, 1.996f, 12f, 1.996f)
                close()
                moveTo(9f, 8.018f)
                curveTo(9.81f, 8.138f, 10.5f, 8.824f, 10.5f, 9.752f)
                verticalLineTo(20.499f)
                horizontalLineTo(13.5f)
                verticalLineTo(12.749f)
                curveTo(13.5f, 11.868f, 14.152f, 11.138f, 15f, 11.017f)
                verticalLineTo(5.749f)
                curveTo(15f, 5.611f, 14.888f, 5.499f, 14.75f, 5.499f)
                horizontalLineTo(12.009f)
                lineTo(12f, 5.499f)
                lineTo(11.991f, 5.499f)
                horizontalLineTo(9.25f)
                curveTo(9.112f, 5.499f, 9f, 5.611f, 9f, 5.749f)
                verticalLineTo(8.018f)
                close()
                moveTo(15.25f, 12.499f)
                curveTo(15.112f, 12.499f, 15f, 12.611f, 15f, 12.749f)
                verticalLineTo(20.499f)
                horizontalLineTo(18.75f)
                curveTo(18.888f, 20.499f, 19f, 20.388f, 19f, 20.249f)
                verticalLineTo(12.749f)
                curveTo(19f, 12.611f, 18.888f, 12.499f, 18.75f, 12.499f)
                horizontalLineTo(15.25f)
                close()
                moveTo(8.623f, 9.537f)
                lineTo(5.123f, 11.605f)
                curveTo(5.047f, 11.65f, 5f, 11.732f, 5f, 11.82f)
                verticalLineTo(20.249f)
                curveTo(5f, 20.388f, 5.112f, 20.499f, 5.25f, 20.499f)
                horizontalLineTo(9f)
                verticalLineTo(9.752f)
                curveTo(9f, 9.558f, 8.789f, 9.438f, 8.623f, 9.537f)
                close()
            }
        }.build()

        return _City!!
    }

@Suppress("ObjectPropertyName")
private var _City: ImageVector? = null

@Preview
@Composable
private fun CityPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.City, contentDescription = null)
    }
}
