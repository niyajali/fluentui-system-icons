/*
 * MIT License
 *
 * Copyright (c) 2020 Microsoft Corporation
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
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

public val FluentIcons.Regular.PremiumPerson: ImageVector
    get() {
        if (_PremiumPerson != null) {
            return _PremiumPerson!!
        }
        _PremiumPerson = ImageVector.Builder(
            name = "Regular.PremiumPerson",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17.999f, 3f)
                curveTo(18.24f, 3f, 18.464f, 3.115f, 18.604f, 3.306f)
                lineTo(18.659f, 3.393f)
                lineTo(21.922f, 9.421f)
                lineTo(21.96f, 9.514f)
                lineTo(21.972f, 9.554f)
                lineTo(21.992f, 9.656f)
                lineTo(21.998f, 9.75f)
                curveTo(21.998f, 9.819f, 21.989f, 9.886f, 21.971f, 9.949f)
                lineTo(21.924f, 10.075f)
                lineTo(21.886f, 10.144f)
                curveTo(21.881f, 10.152f, 21.876f, 10.16f, 21.87f, 10.169f)
                curveTo(21.863f, 10.18f, 21.855f, 10.191f, 21.847f, 10.202f)
                lineTo(21.846f, 10.203f)
                curveTo(21.835f, 10.217f, 21.823f, 10.232f, 21.811f, 10.246f)
                lineTo(21.83f, 10.221f)
                lineTo(20.556f, 11.667f)
                curveTo(20.133f, 11.36f, 19.638f, 11.144f, 19.101f, 11.051f)
                lineTo(19.587f, 10.5f)
                horizontalLineTo(16.612f)
                lineTo(12.699f, 20.523f)
                curveTo(12.583f, 20.819f, 12.3f, 21f, 12f, 21f)
                lineTo(11.997f, 21f)
                curveTo(11.966f, 21f, 11.935f, 20.998f, 11.904f, 20.994f)
                lineTo(11.899f, 20.994f)
                lineTo(11.894f, 20.993f)
                curveTo(11.86f, 20.988f, 11.825f, 20.98f, 11.791f, 20.97f)
                lineTo(11.781f, 20.968f)
                curveTo(11.721f, 20.951f, 11.662f, 20.925f, 11.608f, 20.892f)
                lineTo(11.598f, 20.885f)
                curveTo(11.551f, 20.856f, 11.507f, 20.822f, 11.467f, 20.781f)
                lineTo(2.178f, 10.235f)
                lineTo(2.152f, 10.203f)
                lineTo(2.112f, 10.144f)
                curveTo(2.056f, 10.054f, 2.019f, 9.952f, 2.006f, 9.843f)
                lineTo(2f, 9.75f)
                lineTo(2.003f, 9.684f)
                lineTo(2.016f, 9.595f)
                curveTo(2.022f, 9.565f, 2.03f, 9.537f, 2.04f, 9.509f)
                lineTo(2.062f, 9.45f)
                lineTo(2.09f, 9.393f)
                lineTo(5.339f, 3.393f)
                curveTo(5.454f, 3.181f, 5.662f, 3.039f, 5.897f, 3.007f)
                lineTo(5.999f, 3f)
                horizontalLineTo(17.999f)
                close()
                moveTo(15.002f, 10.5f)
                horizontalLineTo(8.998f)
                lineTo(11.999f, 18.187f)
                lineTo(12f, 18.184f)
                verticalLineTo(18.188f)
                lineTo(15.002f, 10.5f)
                close()
                moveTo(7.389f, 10.5f)
                horizontalLineTo(4.409f)
                lineTo(9.76f, 16.574f)
                lineTo(7.389f, 10.5f)
                close()
                moveTo(8.971f, 4.5f)
                horizontalLineTo(6.445f)
                lineTo(4.007f, 9f)
                horizontalLineTo(7.531f)
                lineTo(8.971f, 4.5f)
                close()
                moveTo(13.451f, 4.5f)
                horizontalLineTo(10.546f)
                lineTo(9.105f, 9f)
                horizontalLineTo(14.89f)
                lineTo(13.451f, 4.5f)
                close()
                moveTo(17.552f, 4.5f)
                horizontalLineTo(15.026f)
                lineTo(16.466f, 9f)
                horizontalLineTo(19.988f)
                lineTo(17.552f, 4.5f)
                close()
                moveTo(21f, 14.5f)
                curveTo(21f, 15.881f, 19.881f, 17f, 18.5f, 17f)
                curveTo(17.119f, 17f, 16f, 15.881f, 16f, 14.5f)
                curveTo(16f, 13.119f, 17.119f, 12f, 18.5f, 12f)
                curveTo(19.881f, 12f, 21f, 13.119f, 21f, 14.5f)
                close()
                moveTo(23f, 19.875f)
                curveTo(23f, 21.431f, 21.714f, 23f, 18.5f, 23f)
                curveTo(15.286f, 23f, 14f, 21.437f, 14f, 19.875f)
                verticalLineTo(19.772f)
                curveTo(14f, 18.793f, 14.794f, 18f, 15.773f, 18f)
                horizontalLineTo(21.227f)
                curveTo(22.206f, 18f, 23f, 18.793f, 23f, 19.772f)
                verticalLineTo(19.875f)
                close()
            }
        }.build()

        return _PremiumPerson!!
    }

@Suppress("ObjectPropertyName")
private var _PremiumPerson: ImageVector? = null

@Preview
@Composable
private fun PremiumPersonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PremiumPerson, contentDescription = null)
    }
}
