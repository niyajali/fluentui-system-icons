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

public val FluentIcons.Regular.Dishwasher: ImageVector
    get() {
        if (_Dishwasher != null) {
            return _Dishwasher!!
        }
        _Dishwasher = ImageVector.Builder(
            name = "Regular.Dishwasher",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.25f, 3f)
                curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
                verticalLineTo(10f)
                horizontalLineTo(4.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(19.5f)
                verticalLineTo(17.75f)
                curveTo(19.5f, 18.716f, 18.716f, 19.5f, 17.75f, 19.5f)
                horizontalLineTo(7f)
                verticalLineTo(19.518f)
                curveTo(7.766f, 19.627f, 8.373f, 20.234f, 8.482f, 21f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 21f, 21f, 19.545f, 21f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
                horizontalLineTo(6.25f)
                close()
                moveTo(19.5f, 8f)
                horizontalLineTo(4.5f)
                verticalLineTo(6.25f)
                curveTo(4.5f, 5.284f, 5.284f, 4.5f, 6.25f, 4.5f)
                horizontalLineTo(17.75f)
                curveTo(18.716f, 4.5f, 19.5f, 5.284f, 19.5f, 6.25f)
                verticalLineTo(8f)
                close()
                moveTo(9f, 6.25f)
                curveTo(9f, 6.802f, 8.552f, 7.25f, 8f, 7.25f)
                curveTo(7.448f, 7.25f, 7f, 6.802f, 7f, 6.25f)
                curveTo(7f, 5.698f, 7.448f, 5.25f, 8f, 5.25f)
                curveTo(8.552f, 5.25f, 9f, 5.698f, 9f, 6.25f)
                close()
                moveTo(12.75f, 5.5f)
                curveTo(12.336f, 5.5f, 12f, 5.836f, 12f, 6.25f)
                curveTo(12f, 6.664f, 12.336f, 7f, 12.75f, 7f)
                horizontalLineTo(16.25f)
                curveTo(16.664f, 7f, 17f, 6.664f, 17f, 6.25f)
                curveTo(17f, 5.836f, 16.664f, 5.5f, 16.25f, 5.5f)
                horizontalLineTo(12.75f)
                close()
                moveTo(2f, 11.75f)
                curveTo(2f, 11.336f, 2.336f, 11f, 2.75f, 11f)
                horizontalLineTo(7.75f)
                curveTo(8.164f, 11f, 8.5f, 11.336f, 8.5f, 11.75f)
                verticalLineTo(13.75f)
                curveTo(8.5f, 15.287f, 7.433f, 16.574f, 6f, 16.913f)
                verticalLineTo(20.5f)
                horizontalLineTo(6.75f)
                curveTo(7.164f, 20.5f, 7.5f, 20.836f, 7.5f, 21.25f)
                curveTo(7.5f, 21.664f, 7.164f, 22f, 6.75f, 22f)
                horizontalLineTo(3.75f)
                curveTo(3.336f, 22f, 3f, 21.664f, 3f, 21.25f)
                curveTo(3f, 20.836f, 3.336f, 20.5f, 3.75f, 20.5f)
                horizontalLineTo(4.5f)
                verticalLineTo(16.913f)
                curveTo(3.067f, 16.574f, 2f, 15.287f, 2f, 13.75f)
                verticalLineTo(11.75f)
                close()
            }
        }.build()

        return _Dishwasher!!
    }

@Suppress("ObjectPropertyName")
private var _Dishwasher: ImageVector? = null

@Preview
@Composable
private fun DishwasherPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Dishwasher, contentDescription = null)
    }
}
