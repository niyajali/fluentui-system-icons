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
 * TableSparkle icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: table, sparkle
 * - Source: ic_fluent_table_sparkle_24_regular.svg
 * 
 * @return The [ImageVector] for the TableSparkle icon.
 */
public val FluentIcons.Regular.TableSparkle: ImageVector
    get() {
        if (_tableSparkle != null) {
            return _tableSparkle!!
        }
        _tableSparkle = Builder(name = "TableSparkle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 13.9f)
                verticalLineTo(17.75f)
                curveTo(21.0f, 19.545f, 19.545f, 21.0f, 17.75f, 21.0f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21.0f, 3.0f, 19.545f, 3.0f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(3.0f, 4.455f, 4.455f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(12.155f)
                lineTo(12.042f, 3.036f)
                lineTo(12.031f, 3.041f)
                curveTo(11.729f, 3.147f, 11.469f, 3.344f, 11.284f, 3.605f)
                curveTo(11.099f, 3.865f, 11.0f, 4.177f, 11.0f, 4.497f)
                lineTo(11.0f, 4.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(8.5f)
                horizontalLineTo(14.0f)
                verticalLineTo(6.72f)
                curveTo(14.051f, 6.761f, 14.099f, 6.805f, 14.146f, 6.852f)
                curveTo(14.2f, 6.906f, 14.251f, 6.964f, 14.297f, 7.024f)
                curveTo(14.425f, 7.189f, 14.523f, 7.374f, 14.589f, 7.572f)
                lineTo(14.589f, 7.573f)
                lineTo(15.04f, 8.958f)
                lineTo(15.044f, 8.97f)
                curveTo(15.15f, 9.271f, 15.347f, 9.532f, 15.608f, 9.717f)
                curveTo(15.869f, 9.901f, 16.181f, 10.0f, 16.5f, 10.0f)
                horizontalLineTo(15.5f)
                lineTo(15.5f, 14.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(13.532f)
                curveTo(19.572f, 13.618f, 19.655f, 13.695f, 19.748f, 13.761f)
                curveTo(19.968f, 13.917f, 20.231f, 14.0f, 20.5f, 14.0f)
                curveTo(20.673f, 14.0f, 20.842f, 13.966f, 21.0f, 13.9f)
                close()
                moveTo(4.5f, 6.25f)
                verticalLineTo(8.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(4.5f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
                close()
                moveTo(4.5f, 14.0f)
                horizontalLineTo(8.5f)
                lineTo(8.5f, 10.0f)
                horizontalLineTo(4.5f)
                verticalLineTo(14.0f)
                close()
                moveTo(10.0f, 14.0f)
                horizontalLineTo(14.0f)
                lineTo(14.0f, 10.0f)
                horizontalLineTo(10.0f)
                lineTo(10.0f, 14.0f)
                close()
                moveTo(10.0f, 15.5f)
                verticalLineTo(19.5f)
                horizontalLineTo(14.0f)
                verticalLineTo(15.5f)
                horizontalLineTo(10.0f)
                close()
                moveTo(17.75f, 19.5f)
                curveTo(18.716f, 19.5f, 19.5f, 18.716f, 19.5f, 17.75f)
                verticalLineTo(15.5f)
                horizontalLineTo(15.5f)
                verticalLineTo(19.5f)
                horizontalLineTo(17.75f)
                close()
                moveTo(4.5f, 17.75f)
                curveTo(4.5f, 18.716f, 5.284f, 19.5f, 6.25f, 19.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(15.5f)
                horizontalLineTo(4.5f)
                verticalLineTo(17.75f)
                close()
                moveTo(15.088f, 6.412f)
                curveTo(15.016f, 6.319f, 14.938f, 6.23f, 14.854f, 6.146f)
                curveTo(14.542f, 5.833f, 14.161f, 5.597f, 13.741f, 5.457f)
                lineTo(12.363f, 5.009f)
                curveTo(12.257f, 4.972f, 12.165f, 4.903f, 12.1f, 4.811f)
                curveTo(12.035f, 4.719f, 12.0f, 4.609f, 12.0f, 4.497f)
                curveTo(12.0f, 4.384f, 12.035f, 4.274f, 12.1f, 4.182f)
                curveTo(12.165f, 4.091f, 12.257f, 4.021f, 12.363f, 3.984f)
                lineTo(13.741f, 3.536f)
                curveTo(14.155f, 3.394f, 14.53f, 3.157f, 14.837f, 2.845f)
                curveTo(15.136f, 2.542f, 15.362f, 2.176f, 15.5f, 1.774f)
                lineTo(15.511f, 1.74f)
                lineTo(15.959f, 0.363f)
                curveTo(15.997f, 0.257f, 16.066f, 0.165f, 16.158f, 0.1f)
                curveTo(16.25f, 0.035f, 16.36f, 0.0f, 16.472f, 0.0f)
                curveTo(16.585f, 0.0f, 16.695f, 0.035f, 16.787f, 0.1f)
                curveTo(16.879f, 0.165f, 16.948f, 0.257f, 16.986f, 0.363f)
                lineTo(17.434f, 1.74f)
                curveTo(17.573f, 2.158f, 17.808f, 2.539f, 18.12f, 2.85f)
                curveTo(18.432f, 3.162f, 18.813f, 3.397f, 19.232f, 3.536f)
                lineTo(20.609f, 3.984f)
                lineTo(20.637f, 3.991f)
                curveTo(20.743f, 4.028f, 20.835f, 4.097f, 20.9f, 4.189f)
                curveTo(20.965f, 4.281f, 21.0f, 4.391f, 21.0f, 4.503f)
                curveTo(21.0f, 4.616f, 20.965f, 4.726f, 20.9f, 4.818f)
                curveTo(20.835f, 4.909f, 20.743f, 4.979f, 20.637f, 5.016f)
                lineTo(19.259f, 5.464f)
                curveTo(18.84f, 5.603f, 18.459f, 5.838f, 18.147f, 6.15f)
                curveTo(17.835f, 6.461f, 17.6f, 6.842f, 17.461f, 7.26f)
                lineTo(17.013f, 8.637f)
                curveTo(17.009f, 8.649f, 17.005f, 8.66f, 17.0f, 8.671f)
                curveTo(16.961f, 8.763f, 16.896f, 8.842f, 16.814f, 8.9f)
                curveTo(16.722f, 8.965f, 16.613f, 9.0f, 16.5f, 9.0f)
                curveTo(16.387f, 9.0f, 16.278f, 8.965f, 16.186f, 8.9f)
                curveTo(16.094f, 8.835f, 16.024f, 8.743f, 15.987f, 8.637f)
                lineTo(15.539f, 7.26f)
                curveTo(15.438f, 6.953f, 15.285f, 6.667f, 15.088f, 6.412f)
                close()
                moveTo(22.783f, 10.213f)
                lineTo(22.017f, 9.965f)
                curveTo(21.785f, 9.887f, 21.573f, 9.757f, 21.4f, 9.584f)
                curveTo(21.226f, 9.41f, 21.096f, 9.199f, 21.019f, 8.966f)
                lineTo(20.77f, 8.202f)
                curveTo(20.749f, 8.143f, 20.71f, 8.092f, 20.659f, 8.056f)
                curveTo(20.608f, 8.019f, 20.547f, 8.0f, 20.485f, 8.0f)
                curveTo(20.422f, 8.0f, 20.361f, 8.019f, 20.31f, 8.056f)
                curveTo(20.259f, 8.092f, 20.22f, 8.143f, 20.2f, 8.202f)
                lineTo(19.951f, 8.966f)
                curveTo(19.875f, 9.197f, 19.747f, 9.408f, 19.576f, 9.581f)
                curveTo(19.406f, 9.754f, 19.197f, 9.885f, 18.967f, 9.965f)
                lineTo(18.202f, 10.213f)
                curveTo(18.143f, 10.234f, 18.092f, 10.273f, 18.056f, 10.324f)
                curveTo(18.019f, 10.375f, 18.0f, 10.436f, 18.0f, 10.498f)
                curveTo(18.0f, 10.561f, 18.019f, 10.622f, 18.056f, 10.673f)
                curveTo(18.092f, 10.724f, 18.143f, 10.762f, 18.202f, 10.783f)
                lineTo(18.967f, 11.032f)
                curveTo(19.2f, 11.109f, 19.412f, 11.24f, 19.586f, 11.414f)
                curveTo(19.759f, 11.588f, 19.889f, 11.8f, 19.966f, 12.033f)
                lineTo(20.215f, 12.798f)
                curveTo(20.236f, 12.857f, 20.274f, 12.908f, 20.325f, 12.944f)
                curveTo(20.376f, 12.981f, 20.437f, 13.0f, 20.5f, 13.0f)
                curveTo(20.563f, 13.0f, 20.624f, 12.981f, 20.675f, 12.944f)
                curveTo(20.726f, 12.908f, 20.764f, 12.857f, 20.785f, 12.798f)
                lineTo(21.034f, 12.033f)
                curveTo(21.111f, 11.801f, 21.242f, 11.59f, 21.415f, 11.416f)
                curveTo(21.589f, 11.243f, 21.8f, 11.113f, 22.033f, 11.035f)
                lineTo(22.798f, 10.787f)
                curveTo(22.857f, 10.766f, 22.908f, 10.727f, 22.944f, 10.676f)
                curveTo(22.981f, 10.625f, 23.0f, 10.564f, 23.0f, 10.502f)
                curveTo(23.0f, 10.439f, 22.981f, 10.378f, 22.944f, 10.327f)
                curveTo(22.908f, 10.276f, 22.857f, 10.238f, 22.798f, 10.217f)
                lineTo(22.783f, 10.213f)
                close()
            }
        }
        .build()
        return _tableSparkle!!
    }

@Suppress("ObjectPropertyName")
private var _tableSparkle: ImageVector? = null

@Preview
@Composable
private fun TableSparklePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TableSparkle, contentDescription = null)
    }
}

