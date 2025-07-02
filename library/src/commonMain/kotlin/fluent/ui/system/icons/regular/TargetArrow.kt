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
 * TargetArrow icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: target, arrow
 * - Source: ic_fluent_target_arrow_24_regular.svg
 * 
 * @return The [ImageVector] for the TargetArrow icon.
 */
public val FluentIcons.Regular.TargetArrow: ImageVector
    get() {
        if (_targetArrow != null) {
            return _targetArrow!!
        }
        _targetArrow = Builder(name = "TargetArrow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.998f, 1.998f)
                curveTo(13.202f, 1.998f, 14.356f, 2.211f, 15.425f, 2.6f)
                lineTo(14.231f, 3.794f)
                curveTo(13.519f, 3.601f, 12.771f, 3.498f, 11.998f, 3.498f)
                curveTo(7.303f, 3.498f, 3.496f, 7.305f, 3.496f, 12.0f)
                curveTo(3.496f, 16.696f, 7.303f, 20.502f, 11.998f, 20.502f)
                curveTo(16.694f, 20.502f, 20.5f, 16.696f, 20.5f, 12.0f)
                curveTo(20.5f, 11.229f, 20.397f, 10.481f, 20.205f, 9.77f)
                lineTo(21.399f, 8.576f)
                curveTo(21.788f, 9.644f, 22.0f, 10.797f, 22.0f, 12.0f)
                curveTo(22.0f, 17.524f, 17.522f, 22.002f, 11.998f, 22.002f)
                curveTo(6.474f, 22.002f, 1.996f, 17.524f, 1.996f, 12.0f)
                curveTo(1.996f, 6.476f, 6.474f, 1.998f, 11.998f, 1.998f)
                close()
                moveTo(11.998f, 6.0f)
                curveTo(12.517f, 6.0f, 13.02f, 6.066f, 13.5f, 6.19f)
                lineTo(13.5f, 7.757f)
                curveTo(13.03f, 7.591f, 12.525f, 7.5f, 11.998f, 7.5f)
                curveTo(9.513f, 7.5f, 7.498f, 9.515f, 7.498f, 12.0f)
                curveTo(7.498f, 14.485f, 9.513f, 16.5f, 11.998f, 16.5f)
                curveTo(14.483f, 16.5f, 16.498f, 14.485f, 16.498f, 12.0f)
                curveTo(16.498f, 11.474f, 16.408f, 10.969f, 16.242f, 10.5f)
                lineTo(17.809f, 10.5f)
                curveTo(17.933f, 10.98f, 17.998f, 11.482f, 17.998f, 12.0f)
                curveTo(17.998f, 15.314f, 15.312f, 18.0f, 11.998f, 18.0f)
                curveTo(8.684f, 18.0f, 5.998f, 15.314f, 5.998f, 12.0f)
                curveTo(5.998f, 8.686f, 8.684f, 6.0f, 11.998f, 6.0f)
                close()
                moveTo(13.998f, 12.0f)
                curveTo(13.998f, 13.105f, 13.103f, 14.0f, 11.998f, 14.0f)
                curveTo(10.894f, 14.0f, 9.998f, 13.105f, 9.998f, 12.0f)
                curveTo(9.998f, 10.896f, 10.894f, 10.0f, 11.998f, 10.0f)
                curveTo(12.276f, 10.0f, 12.54f, 10.057f, 12.781f, 10.159f)
                lineTo(14.5f, 8.439f)
                lineTo(14.5f, 5.25f)
                curveTo(14.5f, 5.051f, 14.579f, 4.861f, 14.72f, 4.72f)
                lineTo(17.22f, 2.22f)
                curveTo(17.434f, 2.005f, 17.757f, 1.941f, 18.037f, 2.057f)
                curveTo(18.317f, 2.173f, 18.5f, 2.447f, 18.5f, 2.75f)
                verticalLineTo(5.5f)
                lineTo(21.25f, 5.5f)
                curveTo(21.553f, 5.5f, 21.827f, 5.683f, 21.943f, 5.963f)
                curveTo(22.059f, 6.243f, 21.995f, 6.566f, 21.781f, 6.781f)
                lineTo(19.28f, 9.281f)
                curveTo(19.14f, 9.421f, 18.949f, 9.5f, 18.75f, 9.5f)
                lineTo(15.561f, 9.5f)
                lineTo(13.84f, 11.22f)
                curveTo(13.942f, 11.46f, 13.998f, 11.724f, 13.998f, 12.0f)
                close()
                moveTo(18.439f, 8.0f)
                lineTo(19.44f, 7.0f)
                lineTo(17.75f, 7.0f)
                curveTo(17.336f, 7.0f, 17.0f, 6.664f, 17.0f, 6.25f)
                verticalLineTo(4.561f)
                lineTo(16.0f, 5.561f)
                lineTo(16.0f, 7.941f)
                curveTo(16.01f, 7.95f, 16.021f, 7.96f, 16.03f, 7.97f)
                curveTo(16.04f, 7.98f, 16.05f, 7.99f, 16.059f, 8.0f)
                lineTo(18.439f, 8.0f)
                close()
            }
        }
        .build()
        return _targetArrow!!
    }

@Suppress("ObjectPropertyName")
private var _targetArrow: ImageVector? = null

@Preview
@Composable
private fun TargetArrowPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TargetArrow, contentDescription = null)
    }
}

