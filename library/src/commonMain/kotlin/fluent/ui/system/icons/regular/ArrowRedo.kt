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

public val FluentUi.Regular.ArrowRedo: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowRedo",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(19.25f, 2f)
            curveTo(18.87f, 2f, 18.557f, 2.282f, 18.507f, 2.648f)
            lineTo(18.5f, 2.75f)
            verticalLineTo(8.44f)
            lineTo(13.926f, 3.88f)
            curveTo(11.484f, 1.438f, 7.562f, 1.379f, 5.048f, 3.701f)
            lineTo(4.862f, 3.88f)
            curveTo(2.359f, 6.383f, 2.359f, 10.441f, 4.862f, 12.944f)
            lineTo(13.707f, 21.784f)
            curveTo(14f, 22.076f, 14.474f, 22.076f, 14.767f, 21.783f)
            curveTo(15.06f, 21.49f, 15.06f, 21.015f, 14.767f, 20.722f)
            lineTo(5.922f, 11.884f)
            curveTo(4.005f, 9.966f, 4.005f, 6.858f, 5.922f, 4.941f)
            curveTo(7.781f, 3.082f, 10.761f, 3.025f, 12.688f, 4.772f)
            lineTo(12.866f, 4.942f)
            lineTo(17.438f, 9.5f)
            lineTo(11.75f, 9.5f)
            curveTo(11.37f, 9.5f, 11.057f, 9.782f, 11.007f, 10.148f)
            lineTo(11f, 10.25f)
            curveTo(11f, 10.63f, 11.282f, 10.944f, 11.648f, 10.993f)
            lineTo(11.75f, 11f)
            horizontalLineTo(19.25f)
            curveTo(19.63f, 11f, 19.944f, 10.718f, 19.993f, 10.352f)
            lineTo(20f, 10.25f)
            verticalLineTo(2.75f)
            curveTo(20f, 2.336f, 19.664f, 2f, 19.25f, 2f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowRedoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ArrowRedo, contentDescription = null)
    }
}
