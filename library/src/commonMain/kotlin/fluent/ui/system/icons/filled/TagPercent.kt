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

public val FluentIcons.Filled.TagPercent: ImageVector
    get() {
        if (_TagPercent != null) {
            return _TagPercent!!
        }
        _TagPercent = ImageVector.Builder(
            name = "Filled.TagPercent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(19.75f, 2f)
                curveTo(20.993f, 2f, 22f, 3.007f, 22f, 4.25f)
                verticalLineTo(9.712f)
                curveTo(22f, 10.574f, 21.657f, 11.4f, 21.048f, 12.01f)
                lineTo(21.022f, 12.036f)
                curveTo(20.007f, 11.38f, 18.798f, 11f, 17.5f, 11f)
                curveTo(13.91f, 11f, 11f, 13.91f, 11f, 17.5f)
                curveTo(11f, 18.77f, 11.364f, 19.955f, 11.994f, 20.956f)
                curveTo(10.737f, 21.757f, 9.05f, 21.61f, 7.951f, 20.514f)
                lineTo(3.489f, 16.059f)
                curveTo(2.219f, 14.791f, 2.217f, 12.733f, 3.485f, 11.463f)
                lineTo(11.985f, 2.953f)
                curveTo(12.595f, 2.343f, 13.422f, 2f, 14.285f, 2f)
                horizontalLineTo(19.75f)
                close()
                moveTo(17f, 5.502f)
                curveTo(16.171f, 5.502f, 15.5f, 6.174f, 15.5f, 7.002f)
                curveTo(15.5f, 7.831f, 16.171f, 8.502f, 17f, 8.502f)
                curveTo(17.828f, 8.502f, 18.5f, 7.831f, 18.5f, 7.002f)
                curveTo(18.5f, 6.174f, 17.828f, 5.502f, 17f, 5.502f)
                close()
                moveTo(23f, 17.5f)
                curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
                curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
                curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
                close()
                moveTo(20.33f, 14.672f)
                curveTo(20.135f, 14.477f, 19.818f, 14.477f, 19.623f, 14.672f)
                lineTo(14.673f, 19.622f)
                curveTo(14.478f, 19.817f, 14.478f, 20.133f, 14.673f, 20.329f)
                curveTo(14.868f, 20.524f, 15.185f, 20.524f, 15.38f, 20.329f)
                lineTo(20.33f, 15.379f)
                curveTo(20.525f, 15.184f, 20.525f, 14.867f, 20.33f, 14.672f)
                close()
                moveTo(14.5f, 16f)
                curveTo(14.5f, 15.724f, 14.724f, 15.5f, 15f, 15.5f)
                curveTo(15.276f, 15.5f, 15.5f, 15.724f, 15.5f, 16f)
                curveTo(15.5f, 16.276f, 15.276f, 16.5f, 15f, 16.5f)
                curveTo(14.724f, 16.5f, 14.5f, 16.276f, 14.5f, 16f)
                close()
                moveTo(15f, 14.5f)
                curveTo(14.172f, 14.5f, 13.5f, 15.172f, 13.5f, 16f)
                curveTo(13.5f, 16.828f, 14.172f, 17.5f, 15f, 17.5f)
                curveTo(15.828f, 17.5f, 16.5f, 16.828f, 16.5f, 16f)
                curveTo(16.5f, 15.172f, 15.828f, 14.5f, 15f, 14.5f)
                close()
                moveTo(20f, 18.5f)
                curveTo(19.724f, 18.5f, 19.5f, 18.724f, 19.5f, 19f)
                curveTo(19.5f, 19.276f, 19.724f, 19.5f, 20f, 19.5f)
                curveTo(20.276f, 19.5f, 20.5f, 19.276f, 20.5f, 19f)
                curveTo(20.5f, 18.724f, 20.276f, 18.5f, 20f, 18.5f)
                close()
                moveTo(18.5f, 19f)
                curveTo(18.5f, 19.828f, 19.172f, 20.5f, 20f, 20.5f)
                curveTo(20.828f, 20.5f, 21.5f, 19.828f, 21.5f, 19f)
                curveTo(21.5f, 18.172f, 20.828f, 17.5f, 20f, 17.5f)
                curveTo(19.172f, 17.5f, 18.5f, 18.172f, 18.5f, 19f)
                close()
            }
        }.build()

        return _TagPercent!!
    }

@Suppress("ObjectPropertyName")
private var _TagPercent: ImageVector? = null

@Preview
@Composable
private fun TagPercentPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TagPercent, contentDescription = null)
    }
}
