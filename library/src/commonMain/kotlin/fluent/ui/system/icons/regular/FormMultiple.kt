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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.FormMultiple: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.FormMultiple",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6f, 12.25f)
            curveTo(6f, 11.007f, 7.007f, 10f, 8.25f, 10f)
            curveTo(9.493f, 10f, 10.5f, 11.007f, 10.5f, 12.25f)
            curveTo(10.5f, 13.493f, 9.493f, 14.5f, 8.25f, 14.5f)
            curveTo(7.007f, 14.5f, 6f, 13.493f, 6f, 12.25f)
            close()
            moveTo(8.25f, 11.5f)
            curveTo(7.836f, 11.5f, 7.5f, 11.836f, 7.5f, 12.25f)
            curveTo(7.5f, 12.664f, 7.836f, 13f, 8.25f, 13f)
            curveTo(8.664f, 13f, 9f, 12.664f, 9f, 12.25f)
            curveTo(9f, 11.836f, 8.664f, 11.5f, 8.25f, 11.5f)
            close()
        }
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.5f, 12.25f)
            curveTo(11.5f, 11.836f, 11.836f, 11.5f, 12.25f, 11.5f)
            horizontalLineTo(14.75f)
            curveTo(15.164f, 11.5f, 15.5f, 11.836f, 15.5f, 12.25f)
            curveTo(15.5f, 12.664f, 15.164f, 13f, 14.75f, 13f)
            horizontalLineTo(12.25f)
            curveTo(11.836f, 13f, 11.5f, 12.664f, 11.5f, 12.25f)
            close()
        }
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6f, 7.75f)
            curveTo(6f, 7.336f, 6.336f, 7f, 6.75f, 7f)
            horizontalLineTo(14.75f)
            curveTo(15.164f, 7f, 15.5f, 7.336f, 15.5f, 7.75f)
            curveTo(15.5f, 8.164f, 15.164f, 8.5f, 14.75f, 8.5f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 8.5f, 6f, 8.164f, 6f, 7.75f)
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
            moveTo(4.5f, 6.25f)
            curveTo(4.5f, 5.284f, 5.284f, 4.5f, 6.25f, 4.5f)
            horizontalLineTo(15.25f)
            curveTo(16.216f, 4.5f, 17f, 5.284f, 17f, 6.25f)
            verticalLineTo(15.25f)
            curveTo(17f, 15.481f, 16.955f, 15.702f, 16.874f, 15.904f)
            curveTo(16.678f, 16.389f, 16.271f, 16.767f, 15.767f, 16.922f)
            curveTo(15.604f, 16.973f, 15.43f, 17f, 15.25f, 17f)
            horizontalLineTo(6.25f)
            curveTo(6.07f, 17f, 5.896f, 16.973f, 5.733f, 16.922f)
            curveTo(5.228f, 16.766f, 4.821f, 16.389f, 4.626f, 15.903f)
            curveTo(4.545f, 15.701f, 4.5f, 15.481f, 4.5f, 15.25f)
            verticalLineTo(6.25f)
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
        Image(imageVector = FluentUi.Regular.FormMultiple, contentDescription = null)
    }
}
