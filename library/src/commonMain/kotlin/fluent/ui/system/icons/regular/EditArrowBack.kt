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

public val FluentUi.Regular.EditArrowBack: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.EditArrowBack",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.891f, 3.048f)
            lineTo(3.941f, 15f)
            curveTo(3.535f, 15.406f, 3.249f, 15.917f, 3.116f, 16.476f)
            lineTo(2.02f, 21.078f)
            curveTo(1.96f, 21.331f, 2.036f, 21.598f, 2.22f, 21.782f)
            curveTo(2.404f, 21.966f, 2.67f, 22.041f, 2.924f, 21.981f)
            lineTo(7.525f, 20.885f)
            curveTo(8.084f, 20.752f, 8.595f, 20.467f, 9.002f, 20.06f)
            lineTo(10.153f, 18.909f)
            curveTo(10.053f, 18.455f, 10f, 17.984f, 10f, 17.5f)
            curveTo(10f, 17.303f, 10.009f, 17.107f, 10.026f, 16.914f)
            lineTo(7.941f, 19f)
            curveTo(7.731f, 19.21f, 7.467f, 19.357f, 7.178f, 19.426f)
            lineTo(3.762f, 20.24f)
            lineTo(4.575f, 16.824f)
            curveTo(4.644f, 16.535f, 4.792f, 16.27f, 5.002f, 16.06f)
            lineTo(15f, 6.061f)
            lineTo(17.939f, 9f)
            lineTo(15.914f, 11.026f)
            curveTo(16.107f, 11.009f, 16.302f, 11f, 16.5f, 11f)
            curveTo(16.983f, 11f, 17.455f, 11.053f, 17.908f, 11.153f)
            lineTo(20.952f, 8.109f)
            curveTo(22.349f, 6.711f, 22.349f, 4.445f, 20.952f, 3.048f)
            curveTo(19.554f, 1.651f, 17.288f, 1.651f, 15.891f, 3.048f)
            close()
            moveTo(19.891f, 4.109f)
            curveTo(20.703f, 4.92f, 20.703f, 6.236f, 19.891f, 7.048f)
            lineTo(19f, 7.939f)
            lineTo(16.061f, 5f)
            lineTo(16.952f, 4.109f)
            curveTo(17.763f, 3.297f, 19.08f, 3.297f, 19.891f, 4.109f)
            close()
            moveTo(22f, 17.5f)
            curveTo(22f, 20.538f, 19.538f, 23f, 16.5f, 23f)
            curveTo(13.462f, 23f, 11f, 20.538f, 11f, 17.5f)
            curveTo(11f, 14.462f, 13.462f, 12f, 16.5f, 12f)
            curveTo(19.538f, 12f, 22f, 14.462f, 22f, 17.5f)
            close()
            moveTo(15.354f, 15.354f)
            curveTo(15.549f, 15.158f, 15.549f, 14.842f, 15.354f, 14.646f)
            curveTo(15.158f, 14.451f, 14.842f, 14.451f, 14.646f, 14.646f)
            lineTo(13.146f, 16.146f)
            curveTo(12.951f, 16.342f, 12.951f, 16.658f, 13.146f, 16.854f)
            lineTo(14.646f, 18.354f)
            curveTo(14.842f, 18.549f, 15.158f, 18.549f, 15.354f, 18.354f)
            curveTo(15.549f, 18.158f, 15.549f, 17.842f, 15.354f, 17.646f)
            lineTo(14.707f, 17f)
            horizontalLineTo(16.75f)
            curveTo(17.993f, 17f, 19f, 18.007f, 19f, 19.25f)
            verticalLineTo(19.5f)
            curveTo(19f, 19.776f, 19.224f, 20f, 19.5f, 20f)
            curveTo(19.776f, 20f, 20f, 19.776f, 20f, 19.5f)
            verticalLineTo(19.25f)
            curveTo(20f, 17.455f, 18.545f, 16f, 16.75f, 16f)
            horizontalLineTo(14.707f)
            lineTo(15.354f, 15.354f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun EditArrowBackPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.EditArrowBack, contentDescription = null)
    }
}
