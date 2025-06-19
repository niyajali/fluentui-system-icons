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

public val FluentIcons.Regular.MailReadBriefcase: ImageVector
    get() {
        if (_MailReadBriefcase != null) {
            return _MailReadBriefcase!!
        }
        _MailReadBriefcase = ImageVector.Builder(
            name = "Regular.MailReadBriefcase",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13.191f, 2.339f)
                curveTo(12.462f, 1.884f, 11.538f, 1.884f, 10.809f, 2.339f)
                lineTo(3.059f, 7.173f)
                curveTo(2.4f, 7.584f, 2f, 8.305f, 2f, 9.082f)
                verticalLineTo(16.75f)
                curveTo(2f, 18.545f, 3.455f, 20f, 5.25f, 20f)
                horizontalLineTo(11f)
                verticalLineTo(18.5f)
                horizontalLineTo(5.25f)
                curveTo(4.284f, 18.5f, 3.5f, 17.716f, 3.5f, 16.75f)
                verticalLineTo(9.371f)
                lineTo(11.651f, 13.66f)
                curveTo(11.686f, 13.679f, 11.722f, 13.694f, 11.758f, 13.707f)
                curveTo(12.095f, 13.38f, 12.523f, 13.147f, 13f, 13.05f)
                verticalLineTo(12.75f)
                curveTo(13f, 12.281f, 13.118f, 11.839f, 13.325f, 11.452f)
                lineTo(12f, 12.149f)
                lineTo(4.361f, 8.129f)
                lineTo(11.603f, 3.612f)
                curveTo(11.846f, 3.46f, 12.154f, 3.46f, 12.397f, 3.612f)
                lineTo(19.639f, 8.129f)
                lineTo(16.084f, 10f)
                horizontalLineTo(19.25f)
                curveTo(19.268f, 10f, 19.285f, 10f, 19.303f, 10f)
                lineTo(20.5f, 9.371f)
                verticalLineTo(10.3f)
                curveTo(21.387f, 10.753f, 21.996f, 11.675f, 22f, 12.738f)
                verticalLineTo(9.082f)
                curveTo(22f, 8.305f, 21.6f, 7.584f, 20.941f, 7.173f)
                lineTo(13.191f, 2.339f)
                close()
                moveTo(14f, 14f)
                horizontalLineTo(13.5f)
                curveTo(12.672f, 14f, 12f, 14.672f, 12f, 15.5f)
                verticalLineTo(20.5f)
                curveTo(12f, 21.328f, 12.672f, 22f, 13.5f, 22f)
                horizontalLineTo(21.5f)
                curveTo(22.328f, 22f, 23f, 21.328f, 23f, 20.5f)
                verticalLineTo(15.5f)
                curveTo(23f, 14.672f, 22.328f, 14f, 21.5f, 14f)
                horizontalLineTo(21f)
                verticalLineTo(12.75f)
                curveTo(21f, 11.783f, 20.216f, 11f, 19.25f, 11f)
                horizontalLineTo(15.75f)
                curveTo(14.783f, 11f, 14f, 11.783f, 14f, 12.75f)
                verticalLineTo(14f)
                close()
                moveTo(15.5f, 12.75f)
                curveTo(15.5f, 12.612f, 15.612f, 12.5f, 15.75f, 12.5f)
                horizontalLineTo(19.25f)
                curveTo(19.388f, 12.5f, 19.5f, 12.612f, 19.5f, 12.75f)
                verticalLineTo(14f)
                horizontalLineTo(15.5f)
                verticalLineTo(12.75f)
                close()
            }
        }.build()

        return _MailReadBriefcase!!
    }

@Suppress("ObjectPropertyName")
private var _MailReadBriefcase: ImageVector? = null

@Preview
@Composable
private fun MailReadBriefcasePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.MailReadBriefcase, contentDescription = null)
    }
}
