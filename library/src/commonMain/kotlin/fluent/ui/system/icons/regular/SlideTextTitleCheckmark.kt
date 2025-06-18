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

public val FluentUi.Regular.SlideTextTitleCheckmark: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SlideTextTitleCheckmark",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4.75f, 4f)
            curveTo(3.231f, 4f, 2f, 5.231f, 2f, 6.75f)
            verticalLineTo(17.25f)
            curveTo(2f, 18.769f, 3.231f, 20f, 4.75f, 20f)
            horizontalLineTo(11.498f)
            curveTo(11.3f, 19.526f, 11.157f, 19.023f, 11.076f, 18.5f)
            horizontalLineTo(4.75f)
            curveTo(4.06f, 18.5f, 3.5f, 17.94f, 3.5f, 17.25f)
            verticalLineTo(6.75f)
            curveTo(3.5f, 6.06f, 4.06f, 5.5f, 4.75f, 5.5f)
            horizontalLineTo(19.25f)
            curveTo(19.94f, 5.5f, 20.5f, 6.06f, 20.5f, 6.75f)
            verticalLineTo(11.732f)
            curveTo(21.051f, 12.019f, 21.556f, 12.383f, 22f, 12.81f)
            verticalLineTo(6.75f)
            curveTo(22f, 5.231f, 20.769f, 4f, 19.25f, 4f)
            horizontalLineTo(4.75f)
            close()
            moveTo(7.5f, 8f)
            curveTo(6.672f, 8f, 6f, 8.672f, 6f, 9.5f)
            curveTo(6f, 10.328f, 6.672f, 11f, 7.5f, 11f)
            horizontalLineTo(16.5f)
            curveTo(17.328f, 11f, 18f, 10.328f, 18f, 9.5f)
            curveTo(18f, 8.672f, 17.328f, 8f, 16.5f, 8f)
            horizontalLineTo(7.5f)
            close()
            moveTo(23f, 17.5f)
            curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
            curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
            curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
            close()
            moveTo(16.854f, 19.854f)
            lineTo(20.854f, 15.854f)
            curveTo(21.049f, 15.658f, 21.049f, 15.342f, 20.854f, 15.146f)
            curveTo(20.658f, 14.951f, 20.342f, 14.951f, 20.146f, 15.146f)
            lineTo(16.5f, 18.793f)
            lineTo(14.854f, 17.146f)
            curveTo(14.658f, 16.951f, 14.342f, 16.951f, 14.146f, 17.146f)
            curveTo(13.951f, 17.342f, 13.951f, 17.658f, 14.146f, 17.854f)
            lineTo(16.146f, 19.854f)
            curveTo(16.342f, 20.049f, 16.658f, 20.049f, 16.854f, 19.854f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SlideTextTitleCheckmarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.SlideTextTitleCheckmark, contentDescription = null)
    }
}
