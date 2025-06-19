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

public val FluentIcons.Regular.CommunicationShield: ImageVector
    get() {
        if (_CommunicationShield != null) {
            return _CommunicationShield!!
        }
        _CommunicationShield = ImageVector.Builder(
            name = "Regular.CommunicationShield",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 3.5f)
                curveTo(7.306f, 3.5f, 3.5f, 7.306f, 3.5f, 12f)
                curveTo(3.5f, 14.345f, 4.448f, 16.466f, 5.984f, 18.005f)
                curveTo(6.277f, 18.298f, 6.277f, 18.773f, 5.983f, 19.066f)
                curveTo(5.69f, 19.358f, 5.215f, 19.358f, 4.923f, 19.065f)
                curveTo(3.118f, 17.257f, 2f, 14.758f, 2f, 12f)
                curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
                curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
                curveTo(22f, 12.324f, 21.985f, 12.645f, 21.954f, 12.961f)
                curveTo(21.405f, 12.781f, 20.907f, 12.486f, 20.498f, 12.184f)
                curveTo(20.499f, 12.123f, 20.5f, 12.061f, 20.5f, 12f)
                curveTo(20.5f, 7.306f, 16.694f, 3.5f, 12f, 3.5f)
                close()
                moveTo(13.056f, 14.267f)
                curveTo(13.219f, 13.683f, 13.711f, 13.289f, 14.221f, 13.148f)
                curveTo(14.399f, 12.804f, 14.5f, 12.414f, 14.5f, 12f)
                curveTo(14.5f, 10.619f, 13.381f, 9.5f, 12f, 9.5f)
                curveTo(10.619f, 9.5f, 9.5f, 10.619f, 9.5f, 12f)
                curveTo(9.5f, 13.381f, 10.619f, 14.5f, 12f, 14.5f)
                curveTo(12.377f, 14.5f, 12.735f, 14.416f, 13.056f, 14.267f)
                close()
                moveTo(17.3f, 11.487f)
                curveTo(17.607f, 11.18f, 18.013f, 11.018f, 18.424f, 11.002f)
                curveTo(17.943f, 7.886f, 15.25f, 5.5f, 12f, 5.5f)
                curveTo(8.41f, 5.5f, 5.5f, 8.41f, 5.5f, 12f)
                curveTo(5.5f, 13.796f, 6.229f, 15.423f, 7.406f, 16.598f)
                curveTo(7.699f, 16.891f, 8.174f, 16.891f, 8.467f, 16.598f)
                curveTo(8.759f, 16.305f, 8.759f, 15.83f, 8.466f, 15.537f)
                curveTo(7.56f, 14.632f, 7f, 13.382f, 7f, 12f)
                curveTo(7f, 9.239f, 9.239f, 7f, 12f, 7f)
                curveTo(14.686f, 7f, 16.877f, 9.118f, 16.995f, 11.775f)
                curveTo(17.111f, 11.672f, 17.213f, 11.574f, 17.3f, 11.487f)
                close()
                moveTo(11f, 12f)
                curveTo(11f, 11.448f, 11.448f, 11f, 12f, 11f)
                curveTo(12.552f, 11f, 13f, 11.448f, 13f, 12f)
                curveTo(13f, 12.552f, 12.552f, 13f, 12f, 13f)
                curveTo(11.448f, 13f, 11f, 12.552f, 11f, 12f)
                close()
                moveTo(18.99f, 12.194f)
                curveTo(19.642f, 12.845f, 20.896f, 13.88f, 22.439f, 14.093f)
                curveTo(22.747f, 14.135f, 23f, 14.378f, 23f, 14.682f)
                verticalLineTo(17.52f)
                curveTo(23f, 21.336f, 19.421f, 22.721f, 18.647f, 22.976f)
                curveTo(18.55f, 23.008f, 18.451f, 23.008f, 18.354f, 22.976f)
                curveTo(17.58f, 22.721f, 14f, 21.336f, 14f, 17.52f)
                lineTo(14f, 14.682f)
                curveTo(14f, 14.378f, 14.253f, 14.135f, 14.561f, 14.093f)
                curveTo(16.103f, 13.88f, 17.358f, 12.845f, 18.01f, 12.194f)
                curveTo(18.27f, 11.935f, 18.729f, 11.935f, 18.99f, 12.194f)
                close()
            }
        }.build()

        return _CommunicationShield!!
    }

@Suppress("ObjectPropertyName")
private var _CommunicationShield: ImageVector? = null

@Preview
@Composable
private fun CommunicationShieldPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CommunicationShield, contentDescription = null)
    }
}
