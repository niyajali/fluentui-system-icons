package fluent.ui.system.icons.filled

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

public val FluentIcons.Filled.PeopleLink: ImageVector
    get() {
        if (_PeopleLink != null) {
            return _PeopleLink!!
        }
        _PeopleLink = ImageVector.Builder(
            name = "Filled.PeopleLink",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(8f, 12f)
                curveTo(10.209f, 12f, 12f, 10.209f, 12f, 8f)
                curveTo(12f, 5.791f, 10.209f, 4f, 8f, 4f)
                curveTo(5.791f, 4f, 4f, 5.791f, 4f, 8f)
                curveTo(4f, 10.209f, 5.791f, 12f, 8f, 12f)
                close()
                moveTo(17f, 12f)
                curveTo(18.657f, 12f, 20f, 10.657f, 20f, 9f)
                curveTo(20f, 7.343f, 18.657f, 6f, 17f, 6f)
                curveTo(15.343f, 6f, 14f, 7.343f, 14f, 9f)
                curveTo(14f, 10.657f, 15.343f, 12f, 17f, 12f)
                close()
                moveTo(4.25f, 14f)
                curveTo(3.007f, 14f, 2f, 15.007f, 2f, 16.25f)
                verticalLineTo(16.5f)
                curveTo(2f, 16.5f, 2f, 21f, 8f, 21f)
                curveTo(9.399f, 21f, 10.472f, 20.755f, 11.294f, 20.38f)
                curveTo(10.792f, 19.627f, 10.5f, 18.723f, 10.5f, 17.75f)
                curveTo(10.5f, 16.259f, 11.187f, 14.929f, 12.261f, 14.058f)
                curveTo(12.097f, 14.02f, 11.926f, 14f, 11.75f, 14f)
                horizontalLineTo(4.25f)
                close()
                moveTo(22.5f, 17.75f)
                curveTo(22.5f, 15.679f, 20.821f, 14f, 18.75f, 14f)
                lineTo(18.648f, 14.007f)
                curveTo(18.282f, 14.057f, 18f, 14.37f, 18f, 14.75f)
                curveTo(18f, 15.164f, 18.336f, 15.5f, 18.75f, 15.5f)
                lineTo(18.904f, 15.505f)
                curveTo(20.075f, 15.584f, 21f, 16.559f, 21f, 17.75f)
                curveTo(21f, 18.993f, 19.993f, 20f, 18.75f, 20f)
                lineTo(18.747f, 20.005f)
                lineTo(18.645f, 20.012f)
                curveTo(18.279f, 20.063f, 17.998f, 20.378f, 18f, 20.758f)
                curveTo(18.002f, 21.172f, 18.339f, 21.507f, 18.753f, 21.505f)
                verticalLineTo(21.5f)
                lineTo(18.952f, 21.495f)
                curveTo(20.928f, 21.391f, 22.5f, 19.754f, 22.5f, 17.75f)
                close()
                moveTo(16f, 14.75f)
                curveTo(16f, 14.336f, 15.664f, 14f, 15.25f, 14f)
                lineTo(15.051f, 14.005f)
                curveTo(13.072f, 14.109f, 11.5f, 15.746f, 11.5f, 17.75f)
                curveTo(11.5f, 19.821f, 13.179f, 21.5f, 15.25f, 21.5f)
                lineTo(15.352f, 21.493f)
                curveTo(15.718f, 21.444f, 16f, 21.13f, 16f, 20.75f)
                curveTo(16f, 20.336f, 15.664f, 20f, 15.25f, 20f)
                lineTo(15.096f, 19.995f)
                curveTo(13.925f, 19.916f, 13f, 18.941f, 13f, 17.75f)
                curveTo(13f, 16.507f, 14.007f, 15.5f, 15.25f, 15.5f)
                lineTo(15.352f, 15.493f)
                curveTo(15.718f, 15.443f, 16f, 15.13f, 16f, 14.75f)
                close()
                moveTo(19.5f, 17.75f)
                curveTo(19.5f, 17.336f, 19.164f, 17f, 18.75f, 17f)
                horizontalLineTo(15.25f)
                lineTo(15.148f, 17.007f)
                curveTo(14.782f, 17.056f, 14.5f, 17.37f, 14.5f, 17.75f)
                curveTo(14.5f, 18.164f, 14.836f, 18.5f, 15.25f, 18.5f)
                horizontalLineTo(18.75f)
                lineTo(18.852f, 18.493f)
                curveTo(19.218f, 18.444f, 19.5f, 18.13f, 19.5f, 17.75f)
                close()
            }
        }.build()

        return _PeopleLink!!
    }

@Suppress("ObjectPropertyName")
private var _PeopleLink: ImageVector? = null

@Preview
@Composable
private fun PeopleLinkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PeopleLink, contentDescription = null)
    }
}
