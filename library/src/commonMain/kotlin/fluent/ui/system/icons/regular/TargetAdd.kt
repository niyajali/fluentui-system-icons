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
 * TargetAdd Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used in targeting & hitting goal scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_target_add_24_regular.svg)
 * 
 * @return The [ImageVector] for the TargetAdd icon.
 */
public val FluentIcons.Regular.TargetAdd: ImageVector
    get() {
        if (_targetAdd != null) {
            return _targetAdd!!
        }
        _targetAdd = Builder(name = "TargetAdd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.496f, 12.0f)
                curveTo(3.496f, 16.606f, 7.159f, 20.357f, 11.731f, 20.498f)
                curveTo(12.012f, 21.038f, 12.367f, 21.534f, 12.783f, 21.972f)
                curveTo(12.524f, 21.992f, 12.262f, 22.002f, 11.998f, 22.002f)
                curveTo(6.474f, 22.002f, 1.996f, 17.524f, 1.996f, 12.0f)
                curveTo(1.996f, 6.476f, 6.474f, 1.998f, 11.998f, 1.998f)
                curveTo(17.522f, 1.998f, 22.0f, 6.476f, 22.0f, 12.0f)
                curveTo(22.0f, 12.263f, 21.99f, 12.523f, 21.97f, 12.781f)
                curveTo(21.532f, 12.366f, 21.036f, 12.011f, 20.496f, 11.73f)
                curveTo(20.354f, 7.159f, 16.604f, 3.498f, 11.998f, 3.498f)
                curveTo(7.303f, 3.498f, 3.496f, 7.304f, 3.496f, 12.0f)
                close()
                moveTo(11.091f, 16.409f)
                curveTo(9.041f, 15.989f, 7.498f, 14.175f, 7.498f, 12.0f)
                curveTo(7.498f, 9.515f, 9.513f, 7.5f, 11.998f, 7.5f)
                curveTo(14.172f, 7.5f, 15.986f, 9.042f, 16.406f, 11.092f)
                curveTo(16.762f, 11.031f, 17.127f, 11.0f, 17.5f, 11.0f)
                curveTo(17.64f, 11.0f, 17.779f, 11.004f, 17.917f, 11.013f)
                curveTo(17.447f, 8.169f, 14.976f, 6.0f, 11.998f, 6.0f)
                curveTo(8.684f, 6.0f, 5.998f, 8.686f, 5.998f, 12.0f)
                curveTo(5.998f, 14.978f, 8.168f, 17.45f, 11.013f, 17.92f)
                curveTo(11.005f, 17.781f, 11.0f, 17.641f, 11.0f, 17.5f)
                curveTo(11.0f, 17.128f, 11.031f, 16.763f, 11.091f, 16.409f)
                close()
                moveTo(12.022f, 14.0f)
                lineTo(11.998f, 14.0f)
                curveTo(10.894f, 14.0f, 9.998f, 13.104f, 9.998f, 12.0f)
                curveTo(9.998f, 10.895f, 10.894f, 10.0f, 11.998f, 10.0f)
                curveTo(13.103f, 10.0f, 13.998f, 10.895f, 13.998f, 12.0f)
                lineTo(13.998f, 12.023f)
                curveTo(13.205f, 12.531f, 12.53f, 13.207f, 12.022f, 14.0f)
                close()
                moveTo(17.5f, 12.0f)
                curveTo(20.538f, 12.0f, 23.0f, 14.462f, 23.0f, 17.5f)
                curveTo(23.0f, 20.538f, 20.538f, 23.0f, 17.5f, 23.0f)
                curveTo(14.462f, 23.0f, 12.0f, 20.538f, 12.0f, 17.5f)
                curveTo(12.0f, 14.462f, 14.462f, 12.0f, 17.5f, 12.0f)
                close()
                moveTo(18.001f, 20.503f)
                lineTo(18.001f, 18.0f)
                horizontalLineTo(20.503f)
                curveTo(20.779f, 18.0f, 21.003f, 17.776f, 21.003f, 17.5f)
                curveTo(21.003f, 17.224f, 20.779f, 17.0f, 20.503f, 17.0f)
                horizontalLineTo(18.0f)
                lineTo(18.0f, 14.499f)
                curveTo(18.0f, 14.223f, 17.776f, 13.999f, 17.5f, 13.999f)
                curveTo(17.224f, 13.999f, 17.0f, 14.223f, 17.0f, 14.499f)
                lineTo(17.0f, 17.0f)
                horizontalLineTo(14.496f)
                curveTo(14.22f, 17.0f, 13.996f, 17.224f, 13.996f, 17.5f)
                curveTo(13.996f, 17.776f, 14.22f, 18.0f, 14.496f, 18.0f)
                horizontalLineTo(17.001f)
                lineTo(17.001f, 20.503f)
                curveTo(17.001f, 20.78f, 17.225f, 21.003f, 17.501f, 21.003f)
                curveTo(17.777f, 21.003f, 18.001f, 20.78f, 18.001f, 20.503f)
                close()
            }
        }
        .build()
        return _targetAdd!!
    }

@Suppress("ObjectPropertyName")
private var _targetAdd: ImageVector? = null

@Preview
@Composable
private fun TargetAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TargetAdd, contentDescription = "TargetAdd Icon")
    }
}

