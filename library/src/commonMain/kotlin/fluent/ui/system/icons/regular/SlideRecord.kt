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

public val FluentUi.Regular.SlideRecord: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SlideRecord",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6f, 8.75f)
            curveTo(6f, 8.336f, 6.336f, 8f, 6.75f, 8f)
            horizontalLineTo(11.25f)
            curveTo(11.664f, 8f, 12f, 8.336f, 12f, 8.75f)
            curveTo(12f, 9.164f, 11.664f, 9.5f, 11.25f, 9.5f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 9.5f, 6f, 9.164f, 6f, 8.75f)
            close()
            moveTo(6.75f, 11f)
            curveTo(6.336f, 11f, 6f, 11.336f, 6f, 11.75f)
            curveTo(6f, 12.164f, 6.336f, 12.5f, 6.75f, 12.5f)
            horizontalLineTo(13.346f)
            curveTo(14.05f, 11.915f, 14.88f, 11.475f, 15.788f, 11.228f)
            curveTo(15.652f, 11.087f, 15.461f, 11f, 15.25f, 11f)
            horizontalLineTo(6.75f)
            close()
            moveTo(20.5f, 11.732f)
            verticalLineTo(6.75f)
            curveTo(20.5f, 6.06f, 19.94f, 5.5f, 19.25f, 5.5f)
            horizontalLineTo(4.75f)
            curveTo(4.06f, 5.5f, 3.5f, 6.06f, 3.5f, 6.75f)
            verticalLineTo(17.25f)
            curveTo(3.5f, 17.94f, 4.06f, 18.5f, 4.75f, 18.5f)
            horizontalLineTo(11.076f)
            curveTo(11.157f, 19.023f, 11.3f, 19.526f, 11.498f, 20f)
            horizontalLineTo(4.75f)
            curveTo(3.231f, 20f, 2f, 18.769f, 2f, 17.25f)
            verticalLineTo(6.75f)
            curveTo(2f, 5.231f, 3.231f, 4f, 4.75f, 4f)
            horizontalLineTo(19.25f)
            curveTo(20.769f, 4f, 22f, 5.231f, 22f, 6.75f)
            verticalLineTo(12.81f)
            curveTo(21.556f, 12.383f, 21.051f, 12.019f, 20.5f, 11.732f)
            close()
            moveTo(12.022f, 14f)
            curveTo(11.725f, 14.463f, 11.486f, 14.967f, 11.314f, 15.5f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 15.5f, 6f, 15.164f, 6f, 14.75f)
            curveTo(6f, 14.336f, 6.336f, 14f, 6.75f, 14f)
            horizontalLineTo(12.022f)
            close()
            moveTo(17.5f, 21.5f)
            curveTo(15.291f, 21.5f, 13.5f, 19.709f, 13.5f, 17.5f)
            curveTo(13.5f, 15.291f, 15.291f, 13.5f, 17.5f, 13.5f)
            curveTo(19.709f, 13.5f, 21.5f, 15.291f, 21.5f, 17.5f)
            curveTo(21.5f, 19.709f, 19.709f, 21.5f, 17.5f, 21.5f)
            close()
            moveTo(17.5f, 23f)
            curveTo(20.538f, 23f, 23f, 20.538f, 23f, 17.5f)
            curveTo(23f, 14.462f, 20.538f, 12f, 17.5f, 12f)
            curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
            curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
            close()
            moveTo(17.5f, 20f)
            curveTo(18.881f, 20f, 20f, 18.881f, 20f, 17.5f)
            curveTo(20f, 16.119f, 18.881f, 15f, 17.5f, 15f)
            curveTo(16.119f, 15f, 15f, 16.119f, 15f, 17.5f)
            curveTo(15f, 18.881f, 16.119f, 20f, 17.5f, 20f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SlideRecordPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.SlideRecord, contentDescription = null)
    }
}
