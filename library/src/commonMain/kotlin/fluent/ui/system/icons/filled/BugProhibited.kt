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
 * BugProhibited icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: bug, prohibited
 * - Source: ic_fluent_bug_prohibited_20_filled.svg
 * 
 * @return The [ImageVector] for the BugProhibited icon.
 */
public val FluentIcons.Filled.BugProhibited: ImageVector
    get() {
        if (_bugProhibited != null) {
            return _bugProhibited!!
        }
        _bugProhibited = Builder(name = "BugProhibited", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.5f, 10.0f)
                curveTo(13.307f, 10.0f, 12.162f, 10.474f, 11.318f, 11.318f)
                curveTo(10.474f, 12.162f, 10.0f, 13.307f, 10.0f, 14.5f)
                curveTo(10.0f, 15.091f, 10.116f, 15.676f, 10.342f, 16.222f)
                curveTo(10.569f, 16.768f, 10.9f, 17.264f, 11.318f, 17.682f)
                curveTo(12.162f, 18.526f, 13.307f, 19.0f, 14.5f, 19.0f)
                curveTo(15.091f, 19.0f, 15.676f, 18.884f, 16.222f, 18.657f)
                curveTo(16.768f, 18.431f, 17.264f, 18.1f, 17.682f, 17.682f)
                curveTo(18.1f, 17.264f, 18.431f, 16.768f, 18.657f, 16.222f)
                curveTo(18.884f, 15.676f, 19.0f, 15.091f, 19.0f, 14.5f)
                curveTo(19.0f, 13.307f, 18.526f, 12.162f, 17.682f, 11.318f)
                curveTo(16.838f, 10.474f, 15.693f, 10.0f, 14.5f, 10.0f)
                close()
                moveTo(11.0f, 14.5f)
                curveTo(11.0f, 13.572f, 11.369f, 12.682f, 12.025f, 12.025f)
                curveTo(12.682f, 11.369f, 13.572f, 11.0f, 14.5f, 11.0f)
                curveTo(15.257f, 10.999f, 15.995f, 11.245f, 16.6f, 11.7f)
                lineTo(11.7f, 16.6f)
                curveTo(11.245f, 15.995f, 10.999f, 15.257f, 11.0f, 14.5f)
                close()
                moveTo(14.5f, 18.0f)
                curveTo(13.743f, 18.001f, 13.005f, 17.756f, 12.4f, 17.3f)
                lineTo(17.3f, 12.4f)
                curveTo(17.756f, 13.005f, 18.001f, 13.743f, 18.0f, 14.5f)
                curveTo(18.0f, 15.428f, 17.631f, 16.319f, 16.975f, 16.975f)
                curveTo(16.319f, 17.631f, 15.428f, 18.0f, 14.5f, 18.0f)
                close()
                moveTo(17.0f, 3.5f)
                curveTo(17.0f, 3.367f, 16.947f, 3.24f, 16.854f, 3.146f)
                curveTo(16.76f, 3.053f, 16.633f, 3.0f, 16.5f, 3.0f)
                curveTo(16.367f, 3.0f, 16.24f, 3.053f, 16.146f, 3.146f)
                curveTo(16.053f, 3.24f, 16.0f, 3.367f, 16.0f, 3.5f)
                verticalLineTo(5.5f)
                curveTo(16.0f, 5.898f, 15.842f, 6.279f, 15.561f, 6.561f)
                curveTo(15.279f, 6.842f, 14.898f, 7.0f, 14.5f, 7.0f)
                horizontalLineTo(14.0f)
                curveTo(14.0f, 6.323f, 13.772f, 5.666f, 13.351f, 5.136f)
                curveTo(12.931f, 4.605f, 12.344f, 4.233f, 11.685f, 4.078f)
                curveTo(11.891f, 3.756f, 12.0f, 3.382f, 12.0f, 3.0f)
                verticalLineTo(2.5f)
                curveTo(12.0f, 2.367f, 11.947f, 2.24f, 11.854f, 2.146f)
                curveTo(11.76f, 2.053f, 11.633f, 2.0f, 11.5f, 2.0f)
                curveTo(11.367f, 2.0f, 11.24f, 2.053f, 11.146f, 2.146f)
                curveTo(11.053f, 2.24f, 11.0f, 2.367f, 11.0f, 2.5f)
                verticalLineTo(3.0f)
                curveTo(11.0f, 3.265f, 10.895f, 3.52f, 10.707f, 3.707f)
                curveTo(10.52f, 3.895f, 10.265f, 4.0f, 10.0f, 4.0f)
                curveTo(9.735f, 4.0f, 9.48f, 3.895f, 9.293f, 3.707f)
                curveTo(9.105f, 3.52f, 9.0f, 3.265f, 9.0f, 3.0f)
                verticalLineTo(2.5f)
                curveTo(9.0f, 2.367f, 8.947f, 2.24f, 8.854f, 2.146f)
                curveTo(8.76f, 2.053f, 8.633f, 2.0f, 8.5f, 2.0f)
                curveTo(8.367f, 2.0f, 8.24f, 2.053f, 8.146f, 2.146f)
                curveTo(8.053f, 2.24f, 8.0f, 2.367f, 8.0f, 2.5f)
                verticalLineTo(3.0f)
                curveTo(8.0f, 3.382f, 8.109f, 3.756f, 8.315f, 4.078f)
                curveTo(7.656f, 4.233f, 7.069f, 4.605f, 6.649f, 5.136f)
                curveTo(6.228f, 5.666f, 6.0f, 6.323f, 6.0f, 7.0f)
                horizontalLineTo(5.5f)
                curveTo(5.102f, 7.0f, 4.721f, 6.842f, 4.439f, 6.561f)
                curveTo(4.158f, 6.279f, 4.0f, 5.898f, 4.0f, 5.5f)
                verticalLineTo(3.5f)
                curveTo(4.0f, 3.367f, 3.947f, 3.24f, 3.854f, 3.146f)
                curveTo(3.76f, 3.053f, 3.633f, 3.0f, 3.5f, 3.0f)
                curveTo(3.367f, 3.0f, 3.24f, 3.053f, 3.146f, 3.146f)
                curveTo(3.053f, 3.24f, 3.0f, 3.367f, 3.0f, 3.5f)
                verticalLineTo(5.5f)
                curveTo(3.0f, 6.163f, 3.263f, 6.799f, 3.732f, 7.268f)
                curveTo(4.201f, 7.737f, 4.837f, 8.0f, 5.5f, 8.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.5f)
                horizontalLineTo(2.5f)
                curveTo(2.367f, 9.5f, 2.24f, 9.553f, 2.146f, 9.646f)
                curveTo(2.053f, 9.74f, 2.0f, 9.867f, 2.0f, 10.0f)
                curveTo(2.0f, 10.133f, 2.053f, 10.26f, 2.146f, 10.354f)
                curveTo(2.24f, 10.447f, 2.367f, 10.5f, 2.5f, 10.5f)
                horizontalLineTo(6.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(5.5f)
                curveTo(4.837f, 12.0f, 4.201f, 12.263f, 3.732f, 12.732f)
                curveTo(3.263f, 13.201f, 3.0f, 13.837f, 3.0f, 14.5f)
                verticalLineTo(16.5f)
                curveTo(3.0f, 16.633f, 3.053f, 16.76f, 3.146f, 16.854f)
                curveTo(3.24f, 16.947f, 3.367f, 17.0f, 3.5f, 17.0f)
                curveTo(3.633f, 17.0f, 3.76f, 16.947f, 3.854f, 16.854f)
                curveTo(3.947f, 16.76f, 4.0f, 16.633f, 4.0f, 16.5f)
                verticalLineTo(14.5f)
                curveTo(4.0f, 14.102f, 4.158f, 13.721f, 4.439f, 13.439f)
                curveTo(4.721f, 13.158f, 5.102f, 13.0f, 5.5f, 13.0f)
                horizontalLineTo(6.0f)
                curveTo(6.002f, 13.987f, 6.37f, 14.938f, 7.032f, 15.669f)
                curveTo(7.695f, 16.4f, 8.605f, 16.859f, 9.587f, 16.958f)
                curveTo(9.202f, 16.196f, 9.001f, 15.354f, 9.0f, 14.5f)
                curveTo(9.002f, 13.129f, 9.516f, 11.807f, 10.44f, 10.795f)
                curveTo(11.365f, 9.782f, 12.634f, 9.151f, 14.0f, 9.025f)
                verticalLineTo(8.0f)
                horizontalLineTo(14.5f)
                curveTo(15.163f, 8.0f, 15.799f, 7.737f, 16.268f, 7.268f)
                curveTo(16.737f, 6.799f, 17.0f, 6.163f, 17.0f, 5.5f)
                verticalLineTo(3.5f)
                close()
            }
        }
        .build()
        return _bugProhibited!!
    }

@Suppress("ObjectPropertyName")
private var _bugProhibited: ImageVector? = null

@Preview
@Composable
private fun BugProhibitedPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.BugProhibited, contentDescription = null)
    }
}

