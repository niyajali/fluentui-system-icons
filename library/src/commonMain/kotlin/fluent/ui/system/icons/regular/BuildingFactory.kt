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

public val FluentIcons.Regular.BuildingFactory: ImageVector
    get() {
        if (_BuildingFactory != null) {
            return _BuildingFactory!!
        }
        _BuildingFactory = ImageVector.Builder(
            name = "Regular.BuildingFactory",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5.17f, 2f)
                curveTo(3.974f, 2f, 2.988f, 2.935f, 2.923f, 4.129f)
                lineTo(2.085f, 19.629f)
                curveTo(2.016f, 20.917f, 3.042f, 22f, 4.332f, 22f)
                horizontalLineTo(7.166f)
                curveTo(8.456f, 22f, 9.482f, 20.917f, 9.412f, 19.629f)
                lineTo(8.574f, 4.129f)
                curveTo(8.51f, 2.935f, 7.523f, 2f, 6.328f, 2f)
                horizontalLineTo(5.17f)
                close()
                moveTo(4.421f, 4.21f)
                curveTo(4.443f, 3.812f, 4.771f, 3.5f, 5.17f, 3.5f)
                horizontalLineTo(6.328f)
                curveTo(6.726f, 3.5f, 7.055f, 3.812f, 7.077f, 4.21f)
                lineTo(7.914f, 19.709f)
                curveTo(7.938f, 20.139f, 7.596f, 20.5f, 7.166f, 20.5f)
                horizontalLineTo(4.332f)
                curveTo(3.902f, 20.5f, 3.56f, 20.139f, 3.583f, 19.709f)
                lineTo(4.421f, 4.21f)
                close()
                moveTo(9.511f, 22f)
                curveTo(9.906f, 21.588f, 10.193f, 21.072f, 10.329f, 20.5f)
                horizontalLineTo(11.499f)
                verticalLineTo(16.25f)
                curveTo(11.499f, 15.283f, 12.282f, 14.5f, 13.249f, 14.5f)
                horizontalLineTo(17.249f)
                curveTo(18.215f, 14.5f, 18.999f, 15.283f, 18.999f, 16.25f)
                verticalLineTo(20.5f)
                horizontalLineTo(19.749f)
                curveTo(20.163f, 20.5f, 20.499f, 20.164f, 20.499f, 19.75f)
                verticalLineTo(7.713f)
                lineTo(15.257f, 12.551f)
                curveTo(15.039f, 12.753f, 14.721f, 12.807f, 14.448f, 12.687f)
                curveTo(14.175f, 12.568f, 13.999f, 12.298f, 13.999f, 12f)
                verticalLineTo(7.713f)
                lineTo(9.971f, 11.431f)
                lineTo(9.866f, 9.487f)
                lineTo(14.24f, 5.449f)
                curveTo(14.459f, 5.247f, 14.777f, 5.193f, 15.05f, 5.313f)
                curveTo(15.323f, 5.432f, 15.499f, 5.702f, 15.499f, 6f)
                verticalLineTo(10.287f)
                lineTo(20.74f, 5.449f)
                curveTo(20.959f, 5.247f, 21.277f, 5.193f, 21.55f, 5.313f)
                curveTo(21.823f, 5.432f, 21.999f, 5.702f, 21.999f, 6f)
                verticalLineTo(19.75f)
                curveTo(21.999f, 20.993f, 20.991f, 22f, 19.749f, 22f)
                horizontalLineTo(9.511f)
                close()
                moveTo(12.999f, 16.25f)
                verticalLineTo(20.5f)
                horizontalLineTo(17.499f)
                verticalLineTo(16.25f)
                curveTo(17.499f, 16.112f, 17.387f, 16f, 17.249f, 16f)
                horizontalLineTo(13.249f)
                curveTo(13.111f, 16f, 12.999f, 16.112f, 12.999f, 16.25f)
                close()
            }
        }.build()

        return _BuildingFactory!!
    }

@Suppress("ObjectPropertyName")
private var _BuildingFactory: ImageVector? = null

@Preview
@Composable
private fun BuildingFactoryPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.BuildingFactory, contentDescription = null)
    }
}
