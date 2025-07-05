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
 * ArrowSyncOff Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used for synchronizing & loading scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_arrow_sync_off_20_filled.svg)
 * 
 * @return The [ImageVector] for the ArrowSyncOff icon.
 */
public val FluentIcons.Filled.ArrowSyncOff: ImageVector
    get() {
        if (_arrowSyncOff != null) {
            return _arrowSyncOff!!
        }
        _arrowSyncOff = Builder(name = "ArrowSyncOff", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.885f, 3.75f)
                curveTo(8.802f, 3.77f, 7.725f, 4.069f, 6.769f, 4.647f)
                lineTo(5.683f, 3.561f)
                curveTo(6.797f, 2.813f, 8.062f, 2.384f, 9.348f, 2.276f)
                lineTo(8.763f, 1.69f)
                curveTo(8.47f, 1.398f, 8.47f, 0.923f, 8.763f, 0.63f)
                curveTo(9.055f, 0.337f, 9.53f, 0.337f, 9.823f, 0.63f)
                lineTo(11.945f, 2.751f)
                curveTo(12.238f, 3.044f, 12.238f, 3.519f, 11.945f, 3.812f)
                lineTo(9.823f, 5.933f)
                curveTo(9.53f, 6.226f, 9.055f, 6.226f, 8.763f, 5.933f)
                curveTo(8.47f, 5.64f, 8.47f, 5.165f, 8.763f, 4.872f)
                lineTo(9.885f, 3.75f)
                close()
                moveTo(4.178f, 4.884f)
                curveTo(1.498f, 7.928f, 1.612f, 12.571f, 4.52f, 15.479f)
                curveTo(4.785f, 15.744f, 5.065f, 15.987f, 5.358f, 16.206f)
                curveTo(5.689f, 16.454f, 6.159f, 16.387f, 6.408f, 16.056f)
                curveTo(6.656f, 15.724f, 6.589f, 15.254f, 6.257f, 15.006f)
                curveTo(6.022f, 14.829f, 5.795f, 14.633f, 5.581f, 14.418f)
                curveTo(3.259f, 12.097f, 3.146f, 8.403f, 5.241f, 5.947f)
                lineTo(14.052f, 14.758f)
                curveTo(12.918f, 15.726f, 11.521f, 16.222f, 10.115f, 16.248f)
                lineTo(11.237f, 15.125f)
                curveTo(11.53f, 14.833f, 11.53f, 14.358f, 11.237f, 14.065f)
                curveTo(10.944f, 13.772f, 10.47f, 13.772f, 10.177f, 14.065f)
                lineTo(8.055f, 16.186f)
                curveTo(7.763f, 16.479f, 7.763f, 16.954f, 8.055f, 17.247f)
                lineTo(10.177f, 19.368f)
                curveTo(10.47f, 19.661f, 10.944f, 19.661f, 11.237f, 19.368f)
                curveTo(11.53f, 19.075f, 11.53f, 18.6f, 11.237f, 18.308f)
                lineTo(10.652f, 17.722f)
                curveTo(12.257f, 17.587f, 13.829f, 16.953f, 15.115f, 15.821f)
                lineTo(17.146f, 17.853f)
                curveTo(17.342f, 18.048f, 17.658f, 18.048f, 17.854f, 17.853f)
                curveTo(18.049f, 17.657f, 18.049f, 17.341f, 17.854f, 17.146f)
                lineTo(2.854f, 2.145f)
                curveTo(2.658f, 1.95f, 2.342f, 1.95f, 2.146f, 2.145f)
                curveTo(1.951f, 2.341f, 1.951f, 2.657f, 2.146f, 2.853f)
                lineTo(4.178f, 4.884f)
                close()
                moveTo(15.352f, 13.23f)
                lineTo(16.438f, 14.316f)
                curveTo(18.463f, 11.303f, 18.144f, 7.183f, 15.48f, 4.519f)
                curveTo(15.215f, 4.254f, 14.935f, 4.011f, 14.642f, 3.792f)
                curveTo(14.311f, 3.544f, 13.841f, 3.611f, 13.592f, 3.942f)
                curveTo(13.344f, 4.274f, 13.411f, 4.744f, 13.743f, 4.992f)
                curveTo(13.978f, 5.169f, 14.205f, 5.365f, 14.419f, 5.58f)
                curveTo(16.495f, 7.655f, 16.805f, 10.826f, 15.352f, 13.23f)
                close()
            }
        }
        .build()
        return _arrowSyncOff!!
    }

@Suppress("ObjectPropertyName")
private var _arrowSyncOff: ImageVector? = null

@Preview
@Composable
private fun ArrowSyncOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowSyncOff, contentDescription = "ArrowSyncOff Icon")
    }
}

