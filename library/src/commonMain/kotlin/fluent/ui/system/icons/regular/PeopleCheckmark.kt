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

public val FluentIcons.Regular.PeopleCheckmark: ImageVector
    get() {
        if (_PeopleCheckmark != null) {
            return _PeopleCheckmark!!
        }
        _PeopleCheckmark = ImageVector.Builder(
            name = "Regular.PeopleCheckmark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5.5f, 7f)
                curveTo(5.5f, 5.619f, 6.619f, 4.5f, 8f, 4.5f)
                curveTo(9.381f, 4.5f, 10.5f, 5.619f, 10.5f, 7f)
                curveTo(10.5f, 8.381f, 9.381f, 9.5f, 8f, 9.5f)
                curveTo(6.619f, 9.5f, 5.5f, 8.381f, 5.5f, 7f)
                close()
                moveTo(8f, 3f)
                curveTo(5.791f, 3f, 4f, 4.791f, 4f, 7f)
                curveTo(4f, 9.209f, 5.791f, 11f, 8f, 11f)
                curveTo(10.209f, 11f, 12f, 9.209f, 12f, 7f)
                curveTo(12f, 4.791f, 10.209f, 3f, 8f, 3f)
                close()
                moveTo(15.5f, 8f)
                curveTo(15.5f, 7.172f, 16.172f, 6.5f, 17f, 6.5f)
                curveTo(17.828f, 6.5f, 18.5f, 7.172f, 18.5f, 8f)
                curveTo(18.5f, 8.828f, 17.828f, 9.5f, 17f, 9.5f)
                curveTo(16.172f, 9.5f, 15.5f, 8.828f, 15.5f, 8f)
                close()
                moveTo(17f, 5f)
                curveTo(15.343f, 5f, 14f, 6.343f, 14f, 8f)
                curveTo(14f, 9.657f, 15.343f, 11f, 17f, 11f)
                curveTo(18.657f, 11f, 20f, 9.657f, 20f, 8f)
                curveTo(20f, 6.343f, 18.657f, 5f, 17f, 5f)
                close()
                moveTo(4.25f, 13f)
                curveTo(3.007f, 13f, 2f, 14.007f, 2f, 15.25f)
                verticalLineTo(15.501f)
                lineTo(2f, 15.502f)
                lineTo(2f, 15.505f)
                lineTo(2f, 15.511f)
                lineTo(2f, 15.528f)
                curveTo(2.001f, 15.541f, 2.001f, 15.557f, 2.002f, 15.577f)
                curveTo(2.004f, 15.617f, 2.007f, 15.67f, 2.014f, 15.736f)
                curveTo(2.027f, 15.866f, 2.052f, 16.045f, 2.102f, 16.256f)
                curveTo(2.2f, 16.678f, 2.397f, 17.24f, 2.792f, 17.805f)
                curveTo(3.611f, 18.975f, 5.172f, 20f, 8f, 20f)
                curveTo(9.369f, 20f, 10.441f, 19.76f, 11.276f, 19.379f)
                curveTo(11.127f, 18.885f, 11.035f, 18.366f, 11.008f, 17.83f)
                curveTo(10.363f, 18.211f, 9.413f, 18.5f, 8f, 18.5f)
                curveTo(5.578f, 18.5f, 4.514f, 17.65f, 4.021f, 16.945f)
                curveTo(3.76f, 16.572f, 3.628f, 16.197f, 3.562f, 15.915f)
                curveTo(3.53f, 15.775f, 3.514f, 15.661f, 3.507f, 15.587f)
                curveTo(3.503f, 15.549f, 3.501f, 15.522f, 3.5f, 15.507f)
                lineTo(3.5f, 15.495f)
                verticalLineTo(15.25f)
                curveTo(3.5f, 14.836f, 3.836f, 14.5f, 4.25f, 14.5f)
                horizontalLineTo(11.732f)
                curveTo(11.981f, 14.023f, 12.286f, 13.581f, 12.641f, 13.183f)
                curveTo(12.367f, 13.065f, 12.066f, 13f, 11.75f, 13f)
                horizontalLineTo(4.25f)
                close()
                moveTo(23f, 17.5f)
                curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
                curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
                curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
                close()
                moveTo(20.854f, 15.146f)
                curveTo(20.658f, 14.951f, 20.342f, 14.951f, 20.146f, 15.146f)
                lineTo(16.5f, 18.793f)
                lineTo(14.854f, 17.146f)
                curveTo(14.658f, 16.951f, 14.342f, 16.951f, 14.146f, 17.146f)
                curveTo(13.951f, 17.342f, 13.951f, 17.658f, 14.146f, 17.854f)
                lineTo(16.146f, 19.854f)
                curveTo(16.342f, 20.049f, 16.658f, 20.049f, 16.854f, 19.854f)
                lineTo(20.854f, 15.854f)
                curveTo(21.049f, 15.658f, 21.049f, 15.342f, 20.854f, 15.146f)
                close()
            }
        }.build()

        return _PeopleCheckmark!!
    }

@Suppress("ObjectPropertyName")
private var _PeopleCheckmark: ImageVector? = null

@Preview
@Composable
private fun PeopleCheckmarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PeopleCheckmark, contentDescription = null)
    }
}
