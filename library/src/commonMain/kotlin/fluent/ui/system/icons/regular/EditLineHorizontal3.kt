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

public val FluentUi.Regular.EditLineHorizontal3: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.EditLineHorizontal3",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.891f, 3.048f)
            curveTo(17.288f, 1.651f, 19.554f, 1.651f, 20.952f, 3.048f)
            curveTo(22.349f, 4.445f, 22.349f, 6.711f, 20.952f, 8.109f)
            lineTo(9.002f, 20.06f)
            curveTo(8.595f, 20.467f, 8.084f, 20.752f, 7.525f, 20.885f)
            lineTo(2.924f, 21.981f)
            curveTo(2.67f, 22.041f, 2.404f, 21.966f, 2.22f, 21.782f)
            curveTo(2.036f, 21.598f, 1.96f, 21.331f, 2.02f, 21.078f)
            lineTo(3.116f, 16.476f)
            curveTo(3.249f, 15.917f, 3.535f, 15.406f, 3.941f, 15f)
            lineTo(15.891f, 3.048f)
            close()
            moveTo(19.891f, 4.109f)
            curveTo(19.08f, 3.297f, 17.763f, 3.297f, 16.952f, 4.109f)
            lineTo(16.061f, 5f)
            lineTo(19f, 7.939f)
            lineTo(19.891f, 7.048f)
            curveTo(20.703f, 6.236f, 20.703f, 4.92f, 19.891f, 4.109f)
            close()
            moveTo(17.939f, 9f)
            lineTo(15f, 6.061f)
            lineTo(5.002f, 16.06f)
            curveTo(4.792f, 16.27f, 4.644f, 16.535f, 4.575f, 16.824f)
            lineTo(3.762f, 20.24f)
            lineTo(7.178f, 19.426f)
            curveTo(7.467f, 19.357f, 7.731f, 19.21f, 7.941f, 19f)
            lineTo(17.939f, 9f)
            close()
            moveTo(2.75f, 3f)
            horizontalLineTo(14.525f)
            lineTo(13.025f, 4.5f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 4.5f, 2f, 4.164f, 2f, 3.75f)
            curveTo(2f, 3.336f, 2.336f, 3f, 2.75f, 3f)
            close()
            moveTo(2.75f, 7f)
            horizontalLineTo(10.526f)
            lineTo(9.026f, 8.5f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 8.5f, 2f, 8.164f, 2f, 7.75f)
            curveTo(2f, 7.336f, 2.336f, 7f, 2.75f, 7f)
            close()
            moveTo(2.75f, 11f)
            horizontalLineTo(6.526f)
            lineTo(5.026f, 12.5f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 12.5f, 2f, 12.164f, 2f, 11.75f)
            curveTo(2f, 11.336f, 2.336f, 11f, 2.75f, 11f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun EditLineHorizontal3Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.EditLineHorizontal3, contentDescription = null)
    }
}
