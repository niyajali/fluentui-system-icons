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

public val FluentUi.Regular.EditLock: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.EditLock",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.891f, 3.048f)
            curveTo(17.288f, 1.651f, 19.554f, 1.651f, 20.952f, 3.048f)
            curveTo(22.349f, 4.445f, 22.349f, 6.711f, 20.952f, 8.109f)
            lineTo(19.149f, 9.912f)
            curveTo(18.658f, 9.649f, 18.096f, 9.5f, 17.5f, 9.5f)
            curveTo(17.48f, 9.5f, 17.459f, 9.5f, 17.439f, 9.501f)
            lineTo(17.939f, 9f)
            lineTo(15f, 6.061f)
            lineTo(5.002f, 16.06f)
            curveTo(4.792f, 16.27f, 4.644f, 16.535f, 4.575f, 16.824f)
            lineTo(3.762f, 20.24f)
            lineTo(7.178f, 19.426f)
            curveTo(7.467f, 19.357f, 7.731f, 19.21f, 7.941f, 19f)
            lineTo(12.084f, 14.857f)
            curveTo(12.029f, 15.062f, 12f, 15.278f, 12f, 15.5f)
            verticalLineTo(17.062f)
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
            moveTo(15f, 14f)
            verticalLineTo(13f)
            curveTo(15f, 11.619f, 16.119f, 10.5f, 17.5f, 10.5f)
            curveTo(18.881f, 10.5f, 20f, 11.619f, 20f, 13f)
            verticalLineTo(14f)
            horizontalLineTo(20.5f)
            curveTo(21.328f, 14f, 22f, 14.672f, 22f, 15.5f)
            verticalLineTo(20.5f)
            curveTo(22f, 21.328f, 21.328f, 22f, 20.5f, 22f)
            horizontalLineTo(14.5f)
            curveTo(13.672f, 22f, 13f, 21.328f, 13f, 20.5f)
            verticalLineTo(15.5f)
            curveTo(13f, 14.672f, 13.672f, 14f, 14.5f, 14f)
            horizontalLineTo(15f)
            close()
            moveTo(16.5f, 13f)
            verticalLineTo(14f)
            horizontalLineTo(18.5f)
            verticalLineTo(13f)
            curveTo(18.5f, 12.448f, 18.052f, 12f, 17.5f, 12f)
            curveTo(16.948f, 12f, 16.5f, 12.448f, 16.5f, 13f)
            close()
            moveTo(18.5f, 18f)
            curveTo(18.5f, 17.448f, 18.052f, 17f, 17.5f, 17f)
            curveTo(16.948f, 17f, 16.5f, 17.448f, 16.5f, 18f)
            curveTo(16.5f, 18.552f, 16.948f, 19f, 17.5f, 19f)
            curveTo(18.052f, 19f, 18.5f, 18.552f, 18.5f, 18f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun EditLockPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.EditLock, contentDescription = null)
    }
}
