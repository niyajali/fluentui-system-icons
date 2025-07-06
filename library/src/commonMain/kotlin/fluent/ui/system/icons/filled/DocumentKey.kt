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

package fluent.ui.system.icons.filled

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * DocumentKey Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent general file types and actions.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_document_key_20_filled.svg)
 * 
 * @return The [ImageVector] for the DocumentKey icon.
 */
public val FluentIcons.Filled.DocumentKey: ImageVector
    get() {
        if (_documentKey != null) {
            return _documentKey!!
        }
        _documentKey = Builder(name = "DocumentKey", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 2.0f)
                verticalLineTo(6.5f)
                curveTo(10.0f, 7.328f, 10.672f, 8.0f, 11.5f, 8.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(15.987f)
                lineTo(15.974f, 9.0f)
                curveTo(15.454f, 9.014f, 14.952f, 9.115f, 14.476f, 9.308f)
                curveTo(13.996f, 9.503f, 13.568f, 9.783f, 13.198f, 10.146f)
                curveTo(12.834f, 10.503f, 12.544f, 10.917f, 12.332f, 11.382f)
                curveTo(12.109f, 11.872f, 12.0f, 12.394f, 12.0f, 12.938f)
                curveTo(12.0f, 13.078f, 12.007f, 13.219f, 12.021f, 13.362f)
                lineTo(9.441f, 15.941f)
                curveTo(9.162f, 16.221f, 9.0f, 16.59f, 9.0f, 17.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(5.5f)
                curveTo(4.672f, 18.0f, 4.0f, 17.328f, 4.0f, 16.5f)
                verticalLineTo(3.5f)
                curveTo(4.0f, 2.672f, 4.672f, 2.0f, 5.5f, 2.0f)
                horizontalLineTo(10.0f)
                close()
                moveTo(11.0f, 2.25f)
                verticalLineTo(6.5f)
                curveTo(11.0f, 6.776f, 11.224f, 7.0f, 11.5f, 7.0f)
                horizontalLineTo(15.75f)
                lineTo(11.0f, 2.25f)
                close()
                moveTo(10.148f, 18.852f)
                curveTo(10.247f, 18.951f, 10.365f, 19.0f, 10.5f, 19.0f)
                horizontalLineTo(12.5f)
                curveTo(12.615f, 18.995f, 12.706f, 18.971f, 12.773f, 18.93f)
                curveTo(12.841f, 18.888f, 12.891f, 18.831f, 12.922f, 18.758f)
                curveTo(12.953f, 18.685f, 12.974f, 18.607f, 12.984f, 18.523f)
                curveTo(12.995f, 18.44f, 13.0f, 18.354f, 13.0f, 18.266f)
                verticalLineTo(18.0f)
                curveTo(13.24f, 17.995f, 13.427f, 17.987f, 13.563f, 17.977f)
                curveTo(13.698f, 17.966f, 13.8f, 17.927f, 13.867f, 17.859f)
                curveTo(13.935f, 17.792f, 13.974f, 17.693f, 13.984f, 17.563f)
                curveTo(13.995f, 17.432f, 14.0f, 17.245f, 14.0f, 17.0f)
                horizontalLineTo(14.5f)
                curveTo(14.609f, 17.0f, 14.698f, 16.977f, 14.766f, 16.93f)
                curveTo(14.833f, 16.883f, 14.885f, 16.826f, 14.922f, 16.758f)
                curveTo(14.958f, 16.69f, 14.982f, 16.612f, 14.992f, 16.523f)
                curveTo(15.003f, 16.435f, 15.008f, 16.344f, 15.008f, 16.25f)
                curveTo(15.003f, 16.172f, 15.0f, 16.096f, 15.0f, 16.023f)
                verticalLineTo(15.828f)
                curveTo(15.172f, 15.891f, 15.346f, 15.935f, 15.523f, 15.961f)
                curveTo(15.7f, 15.987f, 15.88f, 16.0f, 16.063f, 16.0f)
                curveTo(16.479f, 15.995f, 16.862f, 15.914f, 17.211f, 15.758f)
                curveTo(17.56f, 15.602f, 17.87f, 15.383f, 18.141f, 15.102f)
                curveTo(18.412f, 14.82f, 18.622f, 14.5f, 18.773f, 14.141f)
                curveTo(18.924f, 13.781f, 19.0f, 13.401f, 19.0f, 13.0f)
                curveTo(19.0f, 12.583f, 18.922f, 12.193f, 18.766f, 11.828f)
                curveTo(18.609f, 11.464f, 18.396f, 11.146f, 18.125f, 10.875f)
                curveTo(17.854f, 10.604f, 17.537f, 10.391f, 17.172f, 10.234f)
                curveTo(16.807f, 10.078f, 16.417f, 10.0f, 16.0f, 10.0f)
                curveTo(15.594f, 10.01f, 15.211f, 10.089f, 14.852f, 10.234f)
                curveTo(14.492f, 10.38f, 14.175f, 10.589f, 13.898f, 10.859f)
                curveTo(13.622f, 11.13f, 13.404f, 11.443f, 13.242f, 11.797f)
                curveTo(13.081f, 12.151f, 13.0f, 12.531f, 13.0f, 12.938f)
                curveTo(13.0f, 13.182f, 13.029f, 13.44f, 13.086f, 13.711f)
                lineTo(10.148f, 16.648f)
                curveTo(10.05f, 16.747f, 10.0f, 16.865f, 10.0f, 17.0f)
                verticalLineTo(18.5f)
                curveTo(10.0f, 18.635f, 10.05f, 18.753f, 10.148f, 18.852f)
                close()
                moveTo(17.281f, 11.719f)
                curveTo(17.427f, 11.865f, 17.5f, 12.042f, 17.5f, 12.25f)
                curveTo(17.5f, 12.458f, 17.427f, 12.635f, 17.281f, 12.781f)
                curveTo(17.135f, 12.927f, 16.958f, 13.0f, 16.75f, 13.0f)
                curveTo(16.542f, 13.0f, 16.365f, 12.927f, 16.219f, 12.781f)
                curveTo(16.073f, 12.635f, 16.0f, 12.458f, 16.0f, 12.25f)
                curveTo(16.0f, 12.042f, 16.073f, 11.865f, 16.219f, 11.719f)
                curveTo(16.365f, 11.573f, 16.542f, 11.5f, 16.75f, 11.5f)
                curveTo(16.958f, 11.5f, 17.135f, 11.573f, 17.281f, 11.719f)
                close()
            }
        }
        .build()
        return _documentKey!!
    }

@Suppress("ObjectPropertyName")
private var _documentKey: ImageVector? = null

@Preview
@Composable
private fun DocumentKeyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DocumentKey, contentDescription = "DocumentKey Icon")
    }
}

