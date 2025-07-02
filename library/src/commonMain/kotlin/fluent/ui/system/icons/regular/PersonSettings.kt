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
 * PersonSettings icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: person, settings
 * - Source: ic_fluent_person_settings_20_regular.svg
 * 
 * @return The [ImageVector] for the PersonSettings icon.
 */
public val FluentIcons.Regular.PersonSettings: ImageVector
    get() {
        if (_personSettings != null) {
            return _personSettings!!
        }
        _personSettings = Builder(name = "PersonSettings", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 2.0f)
                curveTo(6.791f, 2.0f, 5.0f, 3.791f, 5.0f, 6.0f)
                curveTo(5.0f, 8.209f, 6.791f, 10.0f, 9.0f, 10.0f)
                curveTo(11.209f, 10.0f, 13.0f, 8.209f, 13.0f, 6.0f)
                curveTo(13.0f, 3.791f, 11.209f, 2.0f, 9.0f, 2.0f)
                close()
                moveTo(6.0f, 6.0f)
                curveTo(6.0f, 4.343f, 7.343f, 3.0f, 9.0f, 3.0f)
                curveTo(10.657f, 3.0f, 12.0f, 4.343f, 12.0f, 6.0f)
                curveTo(12.0f, 7.657f, 10.657f, 9.0f, 9.0f, 9.0f)
                curveTo(7.343f, 9.0f, 6.0f, 7.657f, 6.0f, 6.0f)
                close()
                moveTo(4.009f, 11.0f)
                curveTo(2.903f, 11.0f, 2.0f, 11.887f, 2.0f, 13.0f)
                curveTo(2.0f, 14.691f, 2.833f, 15.966f, 4.135f, 16.797f)
                curveTo(5.417f, 17.614f, 7.145f, 18.0f, 9.0f, 18.0f)
                curveTo(9.411f, 18.0f, 9.816f, 17.981f, 10.21f, 17.943f)
                curveTo(9.973f, 17.647f, 9.765f, 17.327f, 9.592f, 16.986f)
                curveTo(9.398f, 16.995f, 9.2f, 17.0f, 9.0f, 17.0f)
                curveTo(7.265f, 17.0f, 5.743f, 16.636f, 4.673f, 15.953f)
                curveTo(3.622f, 15.284f, 3.0f, 14.309f, 3.0f, 13.0f)
                curveTo(3.0f, 12.447f, 3.448f, 12.0f, 4.009f, 12.0f)
                lineTo(9.6f, 12.0f)
                curveTo(9.783f, 11.642f, 10.003f, 11.307f, 10.257f, 11.0f)
                lineTo(4.009f, 11.0f)
                close()
                moveTo(10.635f, 13.92f)
                curveTo(11.723f, 13.642f, 12.369f, 12.523f, 12.066f, 11.442f)
                lineTo(11.91f, 10.885f)
                curveTo(12.164f, 10.69f, 12.439f, 10.523f, 12.731f, 10.388f)
                lineTo(13.069f, 10.746f)
                curveTo(13.858f, 11.583f, 15.189f, 11.583f, 15.978f, 10.747f)
                lineTo(16.303f, 10.403f)
                curveTo(16.601f, 10.544f, 16.881f, 10.718f, 17.138f, 10.922f)
                lineTo(17.012f, 11.344f)
                curveTo(16.682f, 12.446f, 17.348f, 13.598f, 18.468f, 13.863f)
                lineTo(18.817f, 13.945f)
                curveTo(18.838f, 14.127f, 18.849f, 14.312f, 18.849f, 14.5f)
                curveTo(18.849f, 14.656f, 18.842f, 14.81f, 18.827f, 14.962f)
                lineTo(18.366f, 15.08f)
                curveTo(17.278f, 15.358f, 16.632f, 16.476f, 16.936f, 17.558f)
                lineTo(17.092f, 18.114f)
                curveTo(16.838f, 18.309f, 16.562f, 18.477f, 16.27f, 18.612f)
                lineTo(15.932f, 18.254f)
                curveTo(15.144f, 17.417f, 13.813f, 17.416f, 13.023f, 18.252f)
                lineTo(12.698f, 18.596f)
                curveTo(12.4f, 18.456f, 12.12f, 18.282f, 11.863f, 18.079f)
                lineTo(11.99f, 17.656f)
                curveTo(12.319f, 16.554f, 11.653f, 15.401f, 10.534f, 15.137f)
                lineTo(10.184f, 15.054f)
                curveTo(10.163f, 14.873f, 10.151f, 14.688f, 10.151f, 14.5f)
                curveTo(10.151f, 14.344f, 10.159f, 14.19f, 10.174f, 14.038f)
                lineTo(10.635f, 13.92f)
                close()
                moveTo(15.5f, 14.5f)
                curveTo(15.5f, 13.948f, 15.053f, 13.5f, 14.5f, 13.5f)
                curveTo(13.948f, 13.5f, 13.5f, 13.948f, 13.5f, 14.5f)
                curveTo(13.5f, 15.052f, 13.948f, 15.5f, 14.5f, 15.5f)
                curveTo(15.053f, 15.5f, 15.5f, 15.052f, 15.5f, 14.5f)
                close()
            }
        }
        .build()
        return _personSettings!!
    }

@Suppress("ObjectPropertyName")
private var _personSettings: ImageVector? = null

@Preview
@Composable
private fun PersonSettingsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PersonSettings, contentDescription = null)
    }
}

