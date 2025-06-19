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

public val FluentIcons.Filled.DocumentMention: ImageVector
    get() {
        if (_DocumentMention != null) {
            return _DocumentMention!!
        }
        _DocumentMention = ImageVector.Builder(
            name = "Filled.DocumentMention",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 2f)
                verticalLineTo(8f)
                curveTo(12f, 9.105f, 12.895f, 10f, 14f, 10f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                curveTo(20f, 21.105f, 19.105f, 22f, 18f, 22f)
                horizontalLineTo(10.025f)
                curveTo(10.021f, 21.847f, 9.998f, 21.693f, 9.955f, 21.541f)
                curveTo(11.916f, 21.327f, 13.201f, 19.442f, 13.201f, 17.501f)
                curveTo(13.201f, 13.8f, 10.201f, 10.801f, 6.501f, 10.801f)
                curveTo(5.617f, 10.801f, 4.773f, 10.972f, 4f, 11.283f)
                verticalLineTo(4f)
                curveTo(4f, 2.895f, 4.895f, 2f, 6f, 2f)
                horizontalLineTo(12f)
                close()
                moveTo(13.5f, 2.5f)
                verticalLineTo(8f)
                curveTo(13.5f, 8.276f, 13.724f, 8.5f, 14f, 8.5f)
                horizontalLineTo(19.5f)
                lineTo(13.5f, 2.5f)
                close()
                moveTo(12f, 17.5f)
                curveTo(12f, 14.462f, 9.538f, 12f, 6.5f, 12f)
                curveTo(3.462f, 12f, 1f, 14.462f, 1f, 17.5f)
                curveTo(1f, 20.538f, 3.462f, 23f, 6.5f, 23f)
                curveTo(7.071f, 23f, 7.631f, 22.913f, 8.165f, 22.743f)
                lineTo(8.391f, 22.666f)
                lineTo(8.473f, 22.63f)
                curveTo(8.76f, 22.478f, 8.899f, 22.133f, 8.784f, 21.819f)
                curveTo(8.658f, 21.477f, 8.279f, 21.301f, 7.937f, 21.427f)
                lineTo(7.766f, 21.485f)
                lineTo(7.52f, 21.555f)
                curveTo(7.19f, 21.638f, 6.848f, 21.68f, 6.5f, 21.68f)
                curveTo(4.191f, 21.68f, 2.32f, 19.809f, 2.32f, 17.5f)
                curveTo(2.32f, 15.191f, 4.191f, 13.32f, 6.5f, 13.32f)
                curveTo(8.809f, 13.32f, 10.68f, 15.191f, 10.68f, 17.5f)
                curveTo(10.68f, 18.403f, 10.134f, 19.04f, 9.58f, 19.04f)
                curveTo(9.167f, 19.04f, 8.92f, 18.594f, 8.92f, 17.5f)
                verticalLineTo(15.3f)
                lineTo(8.914f, 15.21f)
                curveTo(8.87f, 14.888f, 8.594f, 14.64f, 8.26f, 14.64f)
                curveTo(8.014f, 14.64f, 7.799f, 14.775f, 7.686f, 14.974f)
                curveTo(7.348f, 14.762f, 6.95f, 14.64f, 6.5f, 14.64f)
                curveTo(5.013f, 14.64f, 4.08f, 15.975f, 4.08f, 17.5f)
                curveTo(4.08f, 19.025f, 5.013f, 20.36f, 6.5f, 20.36f)
                curveTo(7.17f, 20.36f, 7.727f, 20.089f, 8.135f, 19.653f)
                curveTo(8.461f, 20.105f, 8.939f, 20.36f, 9.58f, 20.36f)
                curveTo(10.912f, 20.36f, 12f, 19.09f, 12f, 17.5f)
                close()
                moveTo(5.4f, 17.5f)
                curveTo(5.4f, 16.624f, 5.864f, 15.96f, 6.5f, 15.96f)
                curveTo(7.136f, 15.96f, 7.6f, 16.624f, 7.6f, 17.5f)
                curveTo(7.6f, 18.376f, 7.136f, 19.04f, 6.5f, 19.04f)
                curveTo(5.864f, 19.04f, 5.4f, 18.376f, 5.4f, 17.5f)
                close()
            }
        }.build()

        return _DocumentMention!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentMention: ImageVector? = null

@Preview
@Composable
private fun DocumentMentionPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DocumentMention, contentDescription = null)
    }
}
