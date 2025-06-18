package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Filled.FormMultiple: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FormMultiple",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7.25f, 11.5f)
            curveTo(6.836f, 11.5f, 6.5f, 11.836f, 6.5f, 12.25f)
            curveTo(6.5f, 12.664f, 6.836f, 13f, 7.25f, 13f)
            curveTo(7.664f, 13f, 8f, 12.664f, 8f, 12.25f)
            curveTo(8f, 11.836f, 7.664f, 11.5f, 7.25f, 11.5f)
            close()
        }
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.25f, 3f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineTo(15.25f)
            curveTo(3f, 17.045f, 4.455f, 18.5f, 6.25f, 18.5f)
            horizontalLineTo(15.25f)
            curveTo(17.045f, 18.5f, 18.5f, 17.045f, 18.5f, 15.25f)
            verticalLineTo(6.25f)
            curveTo(18.5f, 4.455f, 17.045f, 3f, 15.25f, 3f)
            horizontalLineTo(6.25f)
            close()
            moveTo(5f, 12.25f)
            curveTo(5f, 11.007f, 6.007f, 10f, 7.25f, 10f)
            curveTo(8.493f, 10f, 9.5f, 11.007f, 9.5f, 12.25f)
            curveTo(9.5f, 13.493f, 8.493f, 14.5f, 7.25f, 14.5f)
            curveTo(6.007f, 14.5f, 5f, 13.493f, 5f, 12.25f)
            close()
            moveTo(10.5f, 12.25f)
            curveTo(10.5f, 11.836f, 10.836f, 11.5f, 11.25f, 11.5f)
            horizontalLineTo(15.75f)
            curveTo(16.164f, 11.5f, 16.5f, 11.836f, 16.5f, 12.25f)
            curveTo(16.5f, 12.664f, 16.164f, 13f, 15.75f, 13f)
            horizontalLineTo(11.25f)
            curveTo(10.836f, 13f, 10.5f, 12.664f, 10.5f, 12.25f)
            close()
            moveTo(5f, 7.75f)
            curveTo(5f, 7.336f, 5.336f, 7f, 5.75f, 7f)
            horizontalLineTo(15.75f)
            curveTo(16.164f, 7f, 16.5f, 7.336f, 16.5f, 7.75f)
            curveTo(16.5f, 8.164f, 16.164f, 8.5f, 15.75f, 8.5f)
            horizontalLineTo(5.75f)
            curveTo(5.336f, 8.5f, 5f, 8.164f, 5f, 7.75f)
            close()
        }
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8.75f, 21f)
            curveTo(7.599f, 21f, 6.588f, 20.402f, 6.011f, 19.5f)
            horizontalLineTo(8.724f)
            lineTo(8.75f, 19.5f)
            horizontalLineTo(15.75f)
            curveTo(17.821f, 19.5f, 19.5f, 17.821f, 19.5f, 15.75f)
            verticalLineTo(6.011f)
            curveTo(20.402f, 6.589f, 21f, 7.6f, 21f, 8.75f)
            verticalLineTo(15.75f)
            curveTo(21f, 18.65f, 18.649f, 21f, 15.75f, 21f)
            horizontalLineTo(8.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FormMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.FormMultiple, contentDescription = null)
    }
}
