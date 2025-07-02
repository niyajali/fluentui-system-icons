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
 * CodeVb icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 16dp
 * - Keywords: code, vb
 * - Source: ic_fluent_code_vb_16_filled.svg
 * 
 * @return The [ImageVector] for the CodeVb icon.
 */
public val FluentIcons.Filled.CodeVb: ImageVector
    get() {
        if (_codeVb != null) {
            return _codeVb!!
        }
        _codeVb = Builder(name = "CodeVb", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.179f, 3.821f)
                curveTo(7.356f, 3.737f, 7.565f, 3.728f, 7.752f, 3.794f)
                lineTo(7.753f, 3.792f)
                curveTo(7.939f, 3.858f, 8.09f, 3.994f, 8.178f, 4.176f)
                curveTo(8.263f, 4.355f, 8.272f, 4.564f, 8.206f, 4.751f)
                lineTo(5.706f, 11.75f)
                curveTo(5.656f, 11.894f, 5.561f, 12.02f, 5.433f, 12.111f)
                curveTo(5.304f, 12.201f, 5.155f, 12.248f, 5.0f, 12.248f)
                curveTo(4.845f, 12.248f, 4.696f, 12.201f, 4.569f, 12.112f)
                curveTo(4.439f, 12.02f, 4.345f, 11.895f, 4.293f, 11.749f)
                lineTo(1.794f, 4.75f)
                curveTo(1.76f, 4.657f, 1.745f, 4.559f, 1.751f, 4.458f)
                curveTo(1.756f, 4.366f, 1.779f, 4.268f, 1.821f, 4.179f)
                curveTo(1.863f, 4.09f, 1.924f, 4.009f, 1.995f, 3.943f)
                curveTo(2.07f, 3.876f, 2.157f, 3.824f, 2.25f, 3.792f)
                curveTo(2.341f, 3.759f, 2.442f, 3.752f, 2.54f, 3.75f)
                curveTo(2.632f, 3.755f, 2.73f, 3.778f, 2.819f, 3.82f)
                curveTo(2.908f, 3.862f, 2.989f, 3.923f, 3.055f, 3.994f)
                curveTo(3.122f, 4.069f, 3.174f, 4.156f, 3.206f, 4.249f)
                lineTo(4.999f, 9.269f)
                lineTo(6.793f, 4.248f)
                curveTo(6.859f, 4.062f, 6.999f, 3.906f, 7.179f, 3.821f)
                close()
                moveTo(13.649f, 7.874f)
                curveTo(13.974f, 8.159f, 14.219f, 8.522f, 14.363f, 8.936f)
                curveTo(14.536f, 9.443f, 14.545f, 9.981f, 14.384f, 10.494f)
                curveTo(14.226f, 11.007f, 13.913f, 11.447f, 13.481f, 11.764f)
                curveTo(13.049f, 12.082f, 12.535f, 12.25f, 12.0f, 12.25f)
                horizontalLineTo(9.5f)
                curveTo(9.3f, 12.25f, 9.112f, 12.171f, 8.97f, 12.03f)
                curveTo(8.828f, 11.889f, 8.75f, 11.7f, 8.75f, 11.5f)
                verticalLineTo(4.5f)
                curveTo(8.75f, 4.3f, 8.829f, 4.112f, 8.97f, 3.97f)
                curveTo(9.111f, 3.828f, 9.3f, 3.75f, 9.5f, 3.75f)
                horizontalLineTo(11.755f)
                curveTo(12.257f, 3.75f, 12.743f, 3.9f, 13.158f, 4.183f)
                curveTo(13.576f, 4.468f, 13.894f, 4.866f, 14.078f, 5.337f)
                curveTo(14.262f, 5.808f, 14.3f, 6.317f, 14.186f, 6.808f)
                curveTo(14.095f, 7.204f, 13.911f, 7.567f, 13.649f, 7.874f)
                close()
                moveTo(10.25f, 5.25f)
                verticalLineTo(7.25f)
                horizontalLineTo(11.75f)
                curveTo(12.012f, 7.249f, 12.269f, 7.142f, 12.457f, 6.956f)
                curveTo(12.642f, 6.771f, 12.75f, 6.514f, 12.75f, 6.25f)
                curveTo(12.748f, 5.986f, 12.642f, 5.73f, 12.457f, 5.544f)
                curveTo(12.269f, 5.358f, 12.012f, 5.25f, 11.748f, 5.25f)
                horizontalLineTo(10.25f)
                close()
                moveTo(10.25f, 10.75f)
                horizontalLineTo(12.0f)
                curveTo(12.262f, 10.75f, 12.519f, 10.643f, 12.707f, 10.457f)
                curveTo(12.894f, 10.271f, 13.0f, 10.013f, 13.0f, 9.75f)
                curveTo(13.0f, 9.487f, 12.892f, 9.23f, 12.707f, 9.043f)
                curveTo(12.521f, 8.856f, 12.262f, 8.75f, 12.0f, 8.75f)
                horizontalLineTo(10.25f)
                verticalLineTo(10.75f)
                close()
            }
        }
        .build()
        return _codeVb!!
    }

@Suppress("ObjectPropertyName")
private var _codeVb: ImageVector? = null

@Preview
@Composable
private fun CodeVbPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CodeVb, contentDescription = null)
    }
}

