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

public val FluentIcons.Filled.ClosedCaption: ImageVector
    get() {
        if (_ClosedCaption != null) {
            return _ClosedCaption!!
        }
        _ClosedCaption = ImageVector.Builder(
            name = "Filled.ClosedCaption",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(18.75f, 4f)
                curveTo(20.545f, 4f, 22f, 5.455f, 22f, 7.25f)
                verticalLineTo(16.755f)
                curveTo(22f, 18.549f, 20.545f, 20.005f, 18.75f, 20.005f)
                horizontalLineTo(5.25f)
                curveTo(3.455f, 20.005f, 2f, 18.549f, 2f, 16.755f)
                verticalLineTo(7.25f)
                curveTo(2f, 5.517f, 3.356f, 4.101f, 5.066f, 4.005f)
                lineTo(5.25f, 4f)
                horizontalLineTo(18.75f)
                close()
                moveTo(10.622f, 8.599f)
                curveTo(8.213f, 7.225f, 5.5f, 8.854f, 5.5f, 12f)
                curveTo(5.5f, 15.143f, 8.215f, 16.775f, 10.621f, 15.407f)
                curveTo(10.981f, 15.202f, 11.107f, 14.744f, 10.902f, 14.384f)
                curveTo(10.697f, 14.024f, 10.239f, 13.898f, 9.879f, 14.103f)
                curveTo(8.484f, 14.896f, 7f, 14.005f, 7f, 12f)
                curveTo(7f, 9.994f, 8.481f, 9.104f, 9.878f, 9.901f)
                curveTo(10.238f, 10.107f, 10.696f, 9.981f, 10.901f, 9.622f)
                curveTo(11.107f, 9.262f, 10.981f, 8.804f, 10.622f, 8.599f)
                close()
                moveTo(18.122f, 8.599f)
                curveTo(15.713f, 7.225f, 13f, 8.854f, 13f, 12f)
                curveTo(13f, 15.143f, 15.715f, 16.775f, 18.121f, 15.407f)
                curveTo(18.481f, 15.202f, 18.607f, 14.744f, 18.402f, 14.384f)
                curveTo(18.197f, 14.024f, 17.739f, 13.898f, 17.379f, 14.103f)
                curveTo(15.984f, 14.896f, 14.5f, 14.005f, 14.5f, 12f)
                curveTo(14.5f, 9.994f, 15.981f, 9.104f, 17.378f, 9.901f)
                curveTo(17.738f, 10.107f, 18.196f, 9.981f, 18.402f, 9.622f)
                curveTo(18.607f, 9.262f, 18.481f, 8.804f, 18.122f, 8.599f)
                close()
            }
        }.build()

        return _ClosedCaption!!
    }

@Suppress("ObjectPropertyName")
private var _ClosedCaption: ImageVector? = null

@Preview
@Composable
private fun ClosedCaptionPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ClosedCaption, contentDescription = null)
    }
}
