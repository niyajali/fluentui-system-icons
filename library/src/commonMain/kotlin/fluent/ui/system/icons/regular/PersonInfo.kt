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

public val FluentIcons.Regular.PersonInfo: ImageVector
    get() {
        if (_PersonInfo != null) {
            return _PersonInfo!!
        }
        _PersonInfo = ImageVector.Builder(
            name = "Regular.PersonInfo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11.314f, 15.5f)
                curveTo(11.486f, 14.967f, 11.725f, 14.463f, 12.022f, 14f)
                horizontalLineTo(5.253f)
                curveTo(4.011f, 14f, 3.004f, 15.007f, 3.004f, 16.249f)
                verticalLineTo(16.826f)
                curveTo(3.004f, 17.719f, 3.322f, 18.583f, 3.902f, 19.262f)
                curveTo(5.468f, 21.096f, 7.854f, 22.001f, 11f, 22.001f)
                curveTo(11.601f, 22.001f, 12.173f, 21.968f, 12.717f, 21.902f)
                curveTo(12.326f, 21.477f, 11.991f, 21f, 11.723f, 20.483f)
                curveTo(11.489f, 20.495f, 11.248f, 20.501f, 11f, 20.501f)
                curveTo(8.262f, 20.501f, 6.296f, 19.755f, 5.043f, 18.288f)
                curveTo(4.695f, 17.88f, 4.504f, 17.362f, 4.504f, 16.826f)
                verticalLineTo(16.249f)
                curveTo(4.504f, 15.835f, 4.839f, 15.5f, 5.253f, 15.5f)
                horizontalLineTo(11.314f)
                close()
                moveTo(11f, 2.005f)
                curveTo(13.762f, 2.005f, 16f, 4.243f, 16f, 7.005f)
                curveTo(16f, 9.766f, 13.762f, 12.005f, 11f, 12.005f)
                curveTo(8.239f, 12.005f, 6f, 9.766f, 6f, 7.005f)
                curveTo(6f, 4.243f, 8.239f, 2.005f, 11f, 2.005f)
                close()
                moveTo(11f, 3.505f)
                curveTo(9.067f, 3.505f, 7.5f, 5.072f, 7.5f, 7.005f)
                curveTo(7.5f, 8.938f, 9.067f, 10.505f, 11f, 10.505f)
                curveTo(12.933f, 10.505f, 14.5f, 8.938f, 14.5f, 7.005f)
                curveTo(14.5f, 5.072f, 12.933f, 3.505f, 11f, 3.505f)
                close()
                moveTo(23f, 17.5f)
                curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
                curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
                curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
                close()
                moveTo(13.5f, 17.5f)
                curveTo(13.5f, 19.709f, 15.291f, 21.5f, 17.5f, 21.5f)
                curveTo(19.709f, 21.5f, 21.5f, 19.709f, 21.5f, 17.5f)
                curveTo(21.5f, 15.291f, 19.709f, 13.5f, 17.5f, 13.5f)
                curveTo(15.291f, 13.5f, 13.5f, 15.291f, 13.5f, 17.5f)
                close()
                moveTo(18.5f, 15.5f)
                curveTo(18.5f, 16.052f, 18.052f, 16.5f, 17.5f, 16.5f)
                curveTo(16.948f, 16.5f, 16.5f, 16.052f, 16.5f, 15.5f)
                curveTo(16.5f, 14.948f, 16.948f, 14.5f, 17.5f, 14.5f)
                curveTo(18.052f, 14.5f, 18.5f, 14.948f, 18.5f, 15.5f)
                close()
                moveTo(18.25f, 18f)
                curveTo(18.25f, 17.586f, 17.914f, 17.25f, 17.5f, 17.25f)
                curveTo(17.086f, 17.25f, 16.75f, 17.586f, 16.75f, 18f)
                verticalLineTo(19.75f)
                curveTo(16.75f, 20.164f, 17.086f, 20.5f, 17.5f, 20.5f)
                curveTo(17.914f, 20.5f, 18.25f, 20.164f, 18.25f, 19.75f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _PersonInfo!!
    }

@Suppress("ObjectPropertyName")
private var _PersonInfo: ImageVector? = null

@Preview
@Composable
private fun PersonInfoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PersonInfo, contentDescription = null)
    }
}
