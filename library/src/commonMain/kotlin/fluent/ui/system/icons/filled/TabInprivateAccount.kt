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

public val FluentIcons.Filled.TabInprivateAccount: ImageVector
    get() {
        if (_TabInprivateAccount != null) {
            return _TabInprivateAccount!!
        }
        _TabInprivateAccount = ImageVector.Builder(
            name = "Filled.TabInprivateAccount",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5.75f, 3f)
                curveTo(4.231f, 3f, 3f, 4.231f, 3f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(3f, 19.769f, 4.231f, 21f, 5.75f, 21f)
                horizontalLineTo(12.371f)
                curveTo(12.132f, 20.49f, 12f, 19.928f, 12f, 19.328f)
                verticalLineTo(19f)
                horizontalLineTo(5.75f)
                curveTo(5.336f, 19f, 5f, 18.664f, 5f, 18.25f)
                verticalLineTo(5.75f)
                curveTo(5f, 5.336f, 5.336f, 5f, 5.75f, 5f)
                horizontalLineTo(18.25f)
                curveTo(18.664f, 5f, 19f, 5.336f, 19f, 5.75f)
                verticalLineTo(9.126f)
                curveTo(19.786f, 9.328f, 20.479f, 9.764f, 21f, 10.354f)
                verticalLineTo(5.75f)
                curveTo(21f, 4.231f, 19.769f, 3f, 18.25f, 3f)
                horizontalLineTo(5.75f)
                close()
                moveTo(15f, 13f)
                curveTo(15f, 11.343f, 16.343f, 10f, 18f, 10f)
                verticalLineTo(11f)
                horizontalLineTo(20.236f)
                curveTo(20.494f, 11.288f, 20.698f, 11.627f, 20.829f, 12f)
                horizontalLineTo(18f)
                verticalLineTo(13f)
                horizontalLineTo(21f)
                curveTo(21f, 13.351f, 20.94f, 13.687f, 20.829f, 14f)
                horizontalLineTo(18f)
                verticalLineTo(15f)
                horizontalLineTo(20.236f)
                curveTo(19.687f, 15.614f, 18.889f, 16f, 18f, 16f)
                curveTo(16.343f, 16f, 15f, 14.657f, 15f, 13f)
                close()
                moveTo(14.938f, 17f)
                curveTo(14.356f, 17f, 13.869f, 17.282f, 13.542f, 17.635f)
                curveTo(13.218f, 17.985f, 13f, 18.458f, 13f, 18.944f)
                verticalLineTo(19.328f)
                curveTo(13f, 21.289f, 15.041f, 23f, 18f, 23f)
                verticalLineTo(22f)
                horizontalLineTo(21.473f)
                curveTo(21.881f, 21.712f, 22.218f, 21.373f, 22.47f, 21f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                horizontalLineTo(22.919f)
                curveTo(22.972f, 19.781f, 23f, 19.556f, 23f, 19.328f)
                verticalLineTo(19f)
                horizontalLineTo(18f)
                verticalLineTo(18f)
                horizontalLineTo(22.73f)
                curveTo(22.652f, 17.868f, 22.56f, 17.745f, 22.458f, 17.635f)
                curveTo(22.131f, 17.282f, 21.644f, 17f, 21.063f, 17f)
                horizontalLineTo(14.938f)
                close()
            }
        }.build()

        return _TabInprivateAccount!!
    }

@Suppress("ObjectPropertyName")
private var _TabInprivateAccount: ImageVector? = null

@Preview
@Composable
private fun TabInprivateAccountPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TabInprivateAccount, contentDescription = null)
    }
}
