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

public val FluentIcons.Filled.DeskMultiple: ImageVector
    get() {
        if (_DeskMultiple != null) {
            return _DeskMultiple!!
        }
        _DeskMultiple = ImageVector.Builder(
            name = "Filled.DeskMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.751f, 3.5f)
                curveTo(5.771f, 3.5f, 4.938f, 4.126f, 4.629f, 5f)
                horizontalLineTo(17.251f)
                curveTo(19.046f, 5f, 20.502f, 6.455f, 20.502f, 8.25f)
                verticalLineTo(16.787f)
                curveTo(20.521f, 17.184f, 20.849f, 17.5f, 21.251f, 17.5f)
                curveTo(21.665f, 17.5f, 22.001f, 17.164f, 22.001f, 16.75f)
                verticalLineTo(8.25f)
                curveTo(22.001f, 5.627f, 19.874f, 3.5f, 17.251f, 3.5f)
                horizontalLineTo(6.751f)
                close()
                moveTo(2f, 8.25f)
                curveTo(2f, 7.007f, 3.007f, 6f, 4.25f, 6f)
                horizontalLineTo(17.25f)
                curveTo(18.493f, 6f, 19.5f, 7.007f, 19.5f, 8.25f)
                verticalLineTo(19.25f)
                curveTo(19.5f, 19.664f, 19.164f, 20f, 18.75f, 20f)
                curveTo(18.336f, 20f, 18f, 19.664f, 18f, 19.25f)
                verticalLineTo(9.5f)
                horizontalLineTo(2f)
                verticalLineTo(8.25f)
                close()
                moveTo(2f, 11f)
                horizontalLineTo(11f)
                verticalLineTo(17.75f)
                curveTo(11f, 18.993f, 9.993f, 20f, 8.75f, 20f)
                horizontalLineTo(4.25f)
                curveTo(3.007f, 20f, 2f, 18.993f, 2f, 17.75f)
                verticalLineTo(11f)
                close()
                moveTo(5.25f, 13f)
                curveTo(4.836f, 13f, 4.5f, 13.336f, 4.5f, 13.75f)
                curveTo(4.5f, 14.164f, 4.836f, 14.5f, 5.25f, 14.5f)
                horizontalLineTo(7.75f)
                curveTo(8.164f, 14.5f, 8.5f, 14.164f, 8.5f, 13.75f)
                curveTo(8.5f, 13.336f, 8.164f, 13f, 7.75f, 13f)
                horizontalLineTo(5.25f)
                close()
            }
        }.build()

        return _DeskMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _DeskMultiple: ImageVector? = null

@Preview
@Composable
private fun DeskMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DeskMultiple, contentDescription = null)
    }
}
