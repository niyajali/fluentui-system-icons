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

public val FluentIcons.Filled.Form: ImageVector
    get() {
        if (_Form != null) {
            return _Form!!
        }
        _Form = ImageVector.Builder(
            name = "Filled.Form",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(8.25f, 10f)
                curveTo(7.836f, 10f, 7.5f, 10.336f, 7.5f, 10.75f)
                curveTo(7.5f, 11.164f, 7.836f, 11.5f, 8.25f, 11.5f)
                curveTo(8.664f, 11.5f, 9f, 11.164f, 9f, 10.75f)
                curveTo(9f, 10.336f, 8.664f, 10f, 8.25f, 10f)
                close()
                moveTo(7.5f, 16.25f)
                curveTo(7.5f, 15.836f, 7.836f, 15.5f, 8.25f, 15.5f)
                curveTo(8.664f, 15.5f, 9f, 15.836f, 9f, 16.25f)
                curveTo(9f, 16.664f, 8.664f, 17f, 8.25f, 17f)
                curveTo(7.836f, 17f, 7.5f, 16.664f, 7.5f, 16.25f)
                close()
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
                moveTo(6f, 10.75f)
                curveTo(6f, 11.993f, 7.007f, 13f, 8.25f, 13f)
                curveTo(9.493f, 13f, 10.5f, 11.993f, 10.5f, 10.75f)
                curveTo(10.5f, 9.507f, 9.493f, 8.5f, 8.25f, 8.5f)
                curveTo(7.007f, 8.5f, 6f, 9.507f, 6f, 10.75f)
                close()
                moveTo(8.25f, 14f)
                curveTo(7.007f, 14f, 6f, 15.007f, 6f, 16.25f)
                curveTo(6f, 17.493f, 7.007f, 18.5f, 8.25f, 18.5f)
                curveTo(9.493f, 18.5f, 10.5f, 17.493f, 10.5f, 16.25f)
                curveTo(10.5f, 15.007f, 9.493f, 14f, 8.25f, 14f)
                close()
                moveTo(12f, 10.75f)
                curveTo(12f, 11.164f, 12.336f, 11.5f, 12.75f, 11.5f)
                horizontalLineTo(17.25f)
                curveTo(17.664f, 11.5f, 18f, 11.164f, 18f, 10.75f)
                curveTo(18f, 10.336f, 17.664f, 10f, 17.25f, 10f)
                horizontalLineTo(12.75f)
                curveTo(12.336f, 10f, 12f, 10.336f, 12f, 10.75f)
                close()
                moveTo(12.75f, 15.5f)
                curveTo(12.336f, 15.5f, 12f, 15.836f, 12f, 16.25f)
                curveTo(12f, 16.664f, 12.336f, 17f, 12.75f, 17f)
                horizontalLineTo(17.25f)
                curveTo(17.664f, 17f, 18f, 16.664f, 18f, 16.25f)
                curveTo(18f, 15.836f, 17.664f, 15.5f, 17.25f, 15.5f)
                horizontalLineTo(12.75f)
                close()
                moveTo(6f, 6.25f)
                curveTo(6f, 6.664f, 6.336f, 7f, 6.75f, 7f)
                horizontalLineTo(17.25f)
                curveTo(17.664f, 7f, 18f, 6.664f, 18f, 6.25f)
                curveTo(18f, 5.836f, 17.664f, 5.5f, 17.25f, 5.5f)
                horizontalLineTo(6.75f)
                curveTo(6.336f, 5.5f, 6f, 5.836f, 6f, 6.25f)
                close()
            }
        }.build()

        return _Form!!
    }

@Suppress("ObjectPropertyName")
private var _Form: ImageVector? = null

@Preview
@Composable
private fun FormPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Form, contentDescription = null)
    }
}
