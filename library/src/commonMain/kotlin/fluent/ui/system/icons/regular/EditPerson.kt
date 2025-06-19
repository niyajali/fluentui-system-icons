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
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.EditPerson: ImageVector
    get() {
        if (_EditPerson != null) {
            return _EditPerson!!
        }
        _EditPerson = ImageVector.Builder(
            name = "Regular.EditPerson",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(20.952f, 3.048f)
                curveTo(19.554f, 1.651f, 17.288f, 1.651f, 15.891f, 3.048f)
                lineTo(3.941f, 15f)
                curveTo(3.535f, 15.406f, 3.249f, 15.917f, 3.116f, 16.476f)
                lineTo(2.02f, 21.078f)
                curveTo(1.96f, 21.331f, 2.036f, 21.598f, 2.22f, 21.782f)
                curveTo(2.404f, 21.966f, 2.67f, 22.041f, 2.924f, 21.981f)
                lineTo(7.525f, 20.885f)
                curveTo(8.084f, 20.752f, 8.595f, 20.467f, 9.002f, 20.06f)
                lineTo(14.253f, 14.809f)
                curveTo(14.09f, 14.404f, 14f, 13.963f, 14f, 13.5f)
                curveTo(14f, 13.291f, 14.018f, 13.086f, 14.054f, 12.886f)
                lineTo(7.941f, 19f)
                curveTo(7.731f, 19.21f, 7.467f, 19.357f, 7.178f, 19.426f)
                lineTo(3.762f, 20.24f)
                lineTo(4.575f, 16.824f)
                curveTo(4.644f, 16.535f, 4.792f, 16.27f, 5.002f, 16.06f)
                lineTo(15f, 6.061f)
                lineTo(17.939f, 9f)
                lineTo(16.886f, 10.054f)
                curveTo(17.085f, 10.018f, 17.291f, 10f, 17.5f, 10f)
                curveTo(17.962f, 10f, 18.404f, 10.09f, 18.808f, 10.253f)
                lineTo(20.952f, 8.109f)
                curveTo(22.349f, 6.711f, 22.349f, 4.445f, 20.952f, 3.048f)
                close()
                moveTo(16.952f, 4.109f)
                curveTo(17.763f, 3.297f, 19.08f, 3.297f, 19.891f, 4.109f)
                curveTo(20.703f, 4.92f, 20.703f, 6.236f, 19.891f, 7.048f)
                lineTo(19f, 7.939f)
                lineTo(16.061f, 5f)
                lineTo(16.952f, 4.109f)
                close()
                moveTo(20f, 13.5f)
                curveTo(20f, 14.881f, 18.881f, 16f, 17.5f, 16f)
                curveTo(16.119f, 16f, 15f, 14.881f, 15f, 13.5f)
                curveTo(15f, 12.119f, 16.119f, 11f, 17.5f, 11f)
                curveTo(18.881f, 11f, 20f, 12.119f, 20f, 13.5f)
                close()
                moveTo(22f, 18.875f)
                curveTo(22f, 20.431f, 20.714f, 22f, 17.5f, 22f)
                curveTo(14.286f, 22f, 13f, 20.437f, 13f, 18.875f)
                verticalLineTo(18.772f)
                curveTo(13f, 17.793f, 13.794f, 17f, 14.773f, 17f)
                horizontalLineTo(20.227f)
                curveTo(21.206f, 17f, 22f, 17.793f, 22f, 18.772f)
                verticalLineTo(18.875f)
                close()
            }
        }.build()

        return _EditPerson!!
    }

@Suppress("ObjectPropertyName")
private var _EditPerson: ImageVector? = null

@Preview
@Composable
private fun EditPersonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.EditPerson, contentDescription = null)
    }
}
