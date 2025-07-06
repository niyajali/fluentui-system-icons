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
 * SaveImage Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent saving image data.â ï¸ Before using review if necessary. Floppy disc is old concept. Try a more dynamic save experience with motion and a checkmark or other UI.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_save_image_20_regular.svg)
 * 
 * @return The [ImageVector] for the SaveImage icon.
 */
public val FluentIcons.Regular.SaveImage: ImageVector
    get() {
        if (_saveImage != null) {
            return _saveImage!!
        }
        _saveImage = Builder(name = "SaveImage", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 6.125f)
                verticalLineTo(9.035f)
                curveTo(16.837f, 9.012f, 16.67f, 9.0f, 16.5f, 9.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(6.125f)
                curveTo(16.003f, 5.993f, 15.979f, 5.862f, 15.929f, 5.74f)
                curveTo(15.88f, 5.617f, 15.805f, 5.506f, 15.711f, 5.414f)
                lineTo(13.586f, 3.289f)
                curveTo(13.429f, 3.13f, 13.222f, 3.031f, 13.0f, 3.008f)
                verticalLineTo(5.5f)
                curveTo(13.001f, 5.699f, 12.961f, 5.895f, 12.883f, 6.078f)
                curveTo(12.808f, 6.256f, 12.699f, 6.418f, 12.562f, 6.555f)
                curveTo(12.422f, 6.693f, 12.258f, 6.804f, 12.078f, 6.883f)
                curveTo(11.897f, 6.965f, 11.699f, 7.005f, 11.5f, 7.0f)
                horizontalLineTo(7.5f)
                curveTo(7.301f, 7.001f, 7.105f, 6.961f, 6.922f, 6.883f)
                curveTo(6.744f, 6.808f, 6.582f, 6.699f, 6.445f, 6.562f)
                curveTo(6.307f, 6.422f, 6.196f, 6.258f, 6.117f, 6.078f)
                curveTo(6.035f, 5.897f, 5.995f, 5.699f, 6.0f, 5.5f)
                verticalLineTo(3.0f)
                horizontalLineTo(5.0f)
                curveTo(4.866f, 2.999f, 4.733f, 3.025f, 4.609f, 3.078f)
                curveTo(4.493f, 3.128f, 4.387f, 3.2f, 4.297f, 3.289f)
                curveTo(4.205f, 3.382f, 4.131f, 3.49f, 4.078f, 3.609f)
                curveTo(4.022f, 3.731f, 3.995f, 3.865f, 4.0f, 4.0f)
                verticalLineTo(14.0f)
                curveTo(3.999f, 14.134f, 4.025f, 14.267f, 4.078f, 14.391f)
                curveTo(4.13f, 14.509f, 4.201f, 14.617f, 4.289f, 14.711f)
                curveTo(4.376f, 14.804f, 4.483f, 14.876f, 4.602f, 14.922f)
                curveTo(4.729f, 14.971f, 4.864f, 14.997f, 5.0f, 15.0f)
                verticalLineTo(10.5f)
                curveTo(4.999f, 10.301f, 5.039f, 10.105f, 5.117f, 9.922f)
                curveTo(5.192f, 9.744f, 5.301f, 9.582f, 5.438f, 9.445f)
                curveTo(5.578f, 9.307f, 5.742f, 9.196f, 5.922f, 9.117f)
                curveTo(6.103f, 9.035f, 6.301f, 8.995f, 6.5f, 9.0f)
                horizontalLineTo(12.492f)
                curveTo(11.541f, 9.002f, 10.68f, 9.383f, 10.05f, 10.0f)
                horizontalLineTo(6.5f)
                curveTo(6.368f, 10.001f, 6.241f, 10.054f, 6.148f, 10.148f)
                curveTo(6.054f, 10.241f, 6.001f, 10.368f, 6.0f, 10.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(5.0f)
                curveTo(4.739f, 16.001f, 4.481f, 15.948f, 4.242f, 15.844f)
                curveTo(4.006f, 15.742f, 3.789f, 15.599f, 3.602f, 15.422f)
                curveTo(3.416f, 15.248f, 3.267f, 15.038f, 3.164f, 14.805f)
                curveTo(3.058f, 14.563f, 3.003f, 14.303f, 3.0f, 14.039f)
                verticalLineTo(4.0f)
                curveTo(2.999f, 3.739f, 3.052f, 3.481f, 3.156f, 3.242f)
                curveTo(3.258f, 3.005f, 3.401f, 2.788f, 3.578f, 2.6f)
                curveTo(3.754f, 2.414f, 3.965f, 2.266f, 4.2f, 2.164f)
                curveTo(4.44f, 2.059f, 4.699f, 2.003f, 4.961f, 2.0f)
                horizontalLineTo(12.875f)
                curveTo(13.137f, 1.999f, 13.398f, 2.049f, 13.641f, 2.148f)
                curveTo(13.885f, 2.247f, 14.106f, 2.396f, 14.289f, 2.586f)
                lineTo(16.414f, 4.711f)
                curveTo(16.6f, 4.896f, 16.746f, 5.116f, 16.844f, 5.359f)
                curveTo(16.943f, 5.603f, 16.996f, 5.862f, 17.0f, 6.125f)
                close()
                moveTo(7.0f, 3.0f)
                verticalLineTo(5.5f)
                curveTo(7.001f, 5.632f, 7.054f, 5.759f, 7.148f, 5.852f)
                curveTo(7.241f, 5.946f, 7.368f, 5.999f, 7.5f, 6.0f)
                horizontalLineTo(11.5f)
                curveTo(11.632f, 5.999f, 11.759f, 5.946f, 11.852f, 5.852f)
                curveTo(11.946f, 5.759f, 11.999f, 5.632f, 12.0f, 5.5f)
                verticalLineTo(3.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(10.0f, 12.5f)
                curveTo(10.0f, 11.119f, 11.119f, 10.0f, 12.5f, 10.0f)
                horizontalLineTo(16.5f)
                curveTo(17.881f, 10.0f, 19.0f, 11.119f, 19.0f, 12.5f)
                verticalLineTo(16.5f)
                curveTo(19.0f, 17.01f, 18.848f, 17.483f, 18.586f, 17.879f)
                lineTo(15.561f, 14.854f)
                curveTo(14.975f, 14.268f, 14.025f, 14.268f, 13.439f, 14.854f)
                lineTo(10.414f, 17.879f)
                curveTo(10.152f, 17.483f, 10.0f, 17.01f, 10.0f, 16.5f)
                verticalLineTo(12.5f)
                close()
                moveTo(17.0f, 12.75f)
                curveTo(17.0f, 12.336f, 16.664f, 12.0f, 16.25f, 12.0f)
                curveTo(15.836f, 12.0f, 15.5f, 12.336f, 15.5f, 12.75f)
                curveTo(15.5f, 13.164f, 15.836f, 13.5f, 16.25f, 13.5f)
                curveTo(16.664f, 13.5f, 17.0f, 13.164f, 17.0f, 12.75f)
                close()
                moveTo(11.121f, 18.586f)
                curveTo(11.517f, 18.848f, 11.991f, 19.0f, 12.5f, 19.0f)
                horizontalLineTo(16.5f)
                curveTo(17.01f, 19.0f, 17.483f, 18.848f, 17.879f, 18.586f)
                lineTo(14.854f, 15.561f)
                curveTo(14.658f, 15.365f, 14.342f, 15.365f, 14.146f, 15.561f)
                lineTo(11.121f, 18.586f)
                close()
            }
        }
        .build()
        return _saveImage!!
    }

@Suppress("ObjectPropertyName")
private var _saveImage: ImageVector? = null

@Preview
@Composable
private fun SaveImagePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.SaveImage, contentDescription = "SaveImage Icon")
    }
}

