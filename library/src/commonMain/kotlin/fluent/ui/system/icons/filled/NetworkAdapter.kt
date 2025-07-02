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
 * NetworkAdapter icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 16dp
 * - Keywords: network, adapter
 * - Source: ic_fluent_network_adapter_16_filled.svg
 * 
 * @return The [ImageVector] for the NetworkAdapter icon.
 */
public val FluentIcons.Filled.NetworkAdapter: ImageVector
    get() {
        if (_networkAdapter != null) {
            return _networkAdapter!!
        }
        _networkAdapter = Builder(name = "NetworkAdapter", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.561f, 4.439f)
                curveTo(14.28f, 4.158f, 13.898f, 4.0f, 13.5f, 4.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(3.0f)
                curveTo(2.0f, 2.735f, 1.895f, 2.48f, 1.707f, 2.293f)
                curveTo(1.519f, 2.106f, 1.265f, 2.0f, 1.0f, 2.0f)
                horizontalLineTo(0.5f)
                curveTo(0.367f, 2.0f, 0.24f, 2.053f, 0.146f, 2.146f)
                curveTo(0.052f, 2.24f, 0.0f, 2.367f, 0.0f, 2.5f)
                curveTo(0.0f, 2.633f, 0.053f, 2.76f, 0.146f, 2.854f)
                curveTo(0.239f, 2.948f, 0.367f, 3.0f, 0.5f, 3.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(13.5f)
                curveTo(1.0f, 13.633f, 1.053f, 13.76f, 1.146f, 13.854f)
                curveTo(1.24f, 13.948f, 1.367f, 14.0f, 1.5f, 14.0f)
                curveTo(1.633f, 14.0f, 1.76f, 13.947f, 1.854f, 13.854f)
                curveTo(1.948f, 13.76f, 2.0f, 13.633f, 2.0f, 13.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(13.5f)
                curveTo(6.0f, 13.633f, 6.053f, 13.76f, 6.146f, 13.854f)
                curveTo(6.24f, 13.948f, 6.367f, 14.0f, 6.5f, 14.0f)
                horizontalLineTo(12.5f)
                curveTo(12.633f, 14.0f, 12.76f, 13.947f, 12.854f, 13.854f)
                curveTo(12.948f, 13.76f, 13.0f, 13.633f, 13.0f, 13.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(13.5f)
                curveTo(13.898f, 12.0f, 14.279f, 11.842f, 14.561f, 11.561f)
                curveTo(14.842f, 11.28f, 15.0f, 10.898f, 15.0f, 10.5f)
                verticalLineTo(5.5f)
                curveTo(15.0f, 5.102f, 14.842f, 4.721f, 14.561f, 4.439f)
                close()
                moveTo(4.0f, 9.5f)
                curveTo(4.0f, 9.633f, 3.947f, 9.76f, 3.854f, 9.854f)
                curveTo(3.761f, 9.948f, 3.633f, 10.0f, 3.5f, 10.0f)
                curveTo(3.367f, 10.0f, 3.24f, 9.947f, 3.146f, 9.854f)
                curveTo(3.052f, 9.761f, 3.0f, 9.633f, 3.0f, 9.5f)
                verticalLineTo(6.5f)
                curveTo(3.0f, 6.367f, 3.053f, 6.24f, 3.146f, 6.146f)
                curveTo(3.24f, 6.052f, 3.367f, 6.0f, 3.5f, 6.0f)
                curveTo(3.633f, 6.0f, 3.76f, 6.053f, 3.854f, 6.146f)
                curveTo(3.948f, 6.24f, 4.0f, 6.367f, 4.0f, 6.5f)
                verticalLineTo(9.5f)
                close()
                moveTo(6.5f, 10.0f)
                curveTo(6.367f, 10.0f, 6.24f, 9.947f, 6.146f, 9.854f)
                curveTo(6.052f, 9.761f, 6.0f, 9.633f, 6.0f, 9.5f)
                verticalLineTo(6.5f)
                curveTo(6.0f, 6.367f, 6.053f, 6.24f, 6.146f, 6.146f)
                curveTo(6.24f, 6.052f, 6.367f, 6.0f, 6.5f, 6.0f)
                curveTo(6.633f, 6.0f, 6.76f, 6.053f, 6.854f, 6.146f)
                curveTo(6.948f, 6.24f, 7.0f, 6.367f, 7.0f, 6.5f)
                verticalLineTo(9.5f)
                curveTo(7.0f, 9.633f, 6.947f, 9.76f, 6.854f, 9.854f)
                curveTo(6.761f, 9.948f, 6.633f, 10.0f, 6.5f, 10.0f)
                close()
                moveTo(9.0f, 13.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(13.0f)
                close()
                moveTo(9.5f, 10.0f)
                curveTo(9.367f, 10.0f, 9.24f, 9.947f, 9.146f, 9.854f)
                curveTo(9.052f, 9.761f, 9.0f, 9.633f, 9.0f, 9.5f)
                verticalLineTo(6.5f)
                curveTo(9.0f, 6.367f, 9.053f, 6.24f, 9.146f, 6.146f)
                curveTo(9.24f, 6.052f, 9.367f, 6.0f, 9.5f, 6.0f)
                curveTo(9.633f, 6.0f, 9.76f, 6.053f, 9.854f, 6.146f)
                curveTo(9.948f, 6.24f, 10.0f, 6.367f, 10.0f, 6.5f)
                verticalLineTo(9.5f)
                curveTo(10.0f, 9.633f, 9.947f, 9.76f, 9.854f, 9.854f)
                curveTo(9.761f, 9.948f, 9.633f, 10.0f, 9.5f, 10.0f)
                close()
                moveTo(12.0f, 13.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(13.0f)
                close()
                moveTo(13.0f, 9.5f)
                curveTo(13.0f, 9.633f, 12.947f, 9.76f, 12.854f, 9.854f)
                curveTo(12.76f, 9.948f, 12.633f, 10.0f, 12.5f, 10.0f)
                curveTo(12.367f, 10.0f, 12.24f, 9.947f, 12.146f, 9.854f)
                curveTo(12.052f, 9.76f, 12.0f, 9.633f, 12.0f, 9.5f)
                verticalLineTo(6.5f)
                curveTo(12.0f, 6.367f, 12.053f, 6.24f, 12.146f, 6.146f)
                curveTo(12.239f, 6.052f, 12.367f, 6.0f, 12.5f, 6.0f)
                curveTo(12.633f, 6.0f, 12.76f, 6.053f, 12.854f, 6.146f)
                curveTo(12.948f, 6.239f, 13.0f, 6.367f, 13.0f, 6.5f)
                verticalLineTo(9.5f)
                close()
            }
        }
        .build()
        return _networkAdapter!!
    }

@Suppress("ObjectPropertyName")
private var _networkAdapter: ImageVector? = null

@Preview
@Composable
private fun NetworkAdapterPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.NetworkAdapter, contentDescription = null)
    }
}

